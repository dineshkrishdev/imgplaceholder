package com.dineshkrish.imgservice.core;

import java.io.OutputStream;

import com.dineshkrish.imgservice.exception.PlaceHolderException;
import com.dineshkrish.imgservice.pojo.ImageProperties;

/**
 * 
 * @author Dinesh Krishann - dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

public interface PlaceholderEngine {

	/**
	 * 
	 * @param properties
	 * @param outputStream
	 * @throws PlaceHolderException
	 */
	void render(ImageProperties properties, OutputStream outputStream) throws PlaceHolderException;

}
