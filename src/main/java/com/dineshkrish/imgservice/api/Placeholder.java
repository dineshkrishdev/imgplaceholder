package com.dineshkrish.imgservice.api;

import java.io.ByteArrayOutputStream;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.dineshkrish.imgservice.exception.PlaceHolderException;
import com.dineshkrish.imgservice.pojo.UserInput;
import com.dineshkrish.imgservice.service.PlaceholderService;

/**
 * 
 * @author Dinesh Krishann - dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

@Path("/placeholder")
public class Placeholder {

	/**
	 * 
	 * @param input
	 * @return
	 */
	@GET
	@Path("/{imageSize}")
	@Produces("image/png")
	public Response placeholder(@BeanParam UserInput input) {

		final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		PlaceholderService service = new PlaceholderService();

		try {

			service.createPlaceHolder(outputStream, input);

		} catch (PlaceHolderException e) {

		}

		return Response.ok(outputStream.toByteArray()).build();
	}

}
