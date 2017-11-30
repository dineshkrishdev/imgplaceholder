package com.dineshkrish.imgservice.service;

import java.io.OutputStream;

import com.dineshkrish.imgservice.core.ImageEngine;
import com.dineshkrish.imgservice.core.ImageEngineImpl;
import com.dineshkrish.imgservice.exception.ImgPlaceHolderException;
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
	 * @throws ImgPlaceHolderException
	 */
	public void createPlaceHolder(OutputStream outputStream, UserInput input) throws ImgPlaceHolderException {
		
		PlaceholderUtils.validate(input);
		
		ImageEngine engine = new ImageEngineImpl();
		
		engine.render(PlaceholderUtils.constructImgProperties(input), outputStream);	
	}
	
}
