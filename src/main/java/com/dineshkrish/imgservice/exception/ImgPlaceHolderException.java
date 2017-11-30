package com.dineshkrish.imgservice.exception;

/**
 * 
 * @author Dinesh Krishnan - dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

public class ImgPlaceHolderException extends Exception {

	/**
	 * 
	 */
	public ImgPlaceHolderException() {

	}

	/**
	 * 
	 * @param message
	 */
	public ImgPlaceHolderException(String message) {

		super(message);
	}

	/**
	 * 
	 * @param throwable
	 */
	public ImgPlaceHolderException(Throwable throwable) {

		super(throwable);
	}

	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public ImgPlaceHolderException(String message, Throwable throwable) {

		super(message, throwable);
	}

}
