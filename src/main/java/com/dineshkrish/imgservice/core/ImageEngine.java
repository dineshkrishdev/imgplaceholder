package com.dineshkrish.imgservice.core;

import java.io.OutputStream;

import com.dineshkrish.imgservice.exception.ImgPlaceHolderException;
import com.dineshkrish.imgservice.pojo.ImageProperties;

/**
 * 
 * @author Dinesh Krishann - dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

public interface ImageEngine {

	/**
	 * 
	 * @param properties
	 * @param outputStream
	 * @throws ImgPlaceHolderException
	 */
	void render(ImageProperties properties, OutputStream outputStream) throws ImgPlaceHolderException;

}
