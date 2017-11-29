package com.dineshkrish.imgplaceholder.api;

import java.io.ByteArrayOutputStream;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.dineshkrish.imgplaceholder.exception.ImgPlaceHolderException;
import com.dineshkrish.imgplaceholder.pojo.UserInput;
import com.dineshkrish.imgplaceholder.service.PlaceholderService;

/**
 * 
 * @author Dinesh Krishann - dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

@Path("/")
public class Placeholder {

	@GET
	@Path("/{imageSize}")
	@Produces("image/png")
	public Response placeholder(@BeanParam UserInput input) {

		final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		PlaceholderService service = new PlaceholderService();

		try {

			service.createPlaceHolder(outputStream, input);

		} catch (ImgPlaceHolderException e) {

			e.printStackTrace();
		}

		return Response.ok(outputStream.toByteArray()).build();
	}

}
