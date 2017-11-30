package com.dineshkrish.imgservice.service;

import java.io.OutputStream;

import com.dineshkrish.imgservice.core.PlaceholderEngine;
import com.dineshkrish.imgservice.core.impl.PlaceholderEngineImpl;
import com.dineshkrish.imgservice.exception.PlaceHolderException;
import com.dineshkrish.imgservice.pojo.UserInput;
import com.dineshkrish.imgservice.util.PlaceholderUtils;

/**
 * 
 * @author Dinesh Krishnan, dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

public class PlaceholderService {
	
	/**
	 * 
	 * @param outputStream
	 * @param input
	 * @throws PlaceHolderException
	 */
	public void createPlaceHolder(OutputStream outputStream, UserInput input) throws PlaceHolderException {
		
		PlaceholderUtils.validate(input);
		
		PlaceholderEngine engine = new PlaceholderEngineImpl();
		
		engine.render(PlaceholderUtils.constructImgProperties(input), outputStream);	
	}
	
}
