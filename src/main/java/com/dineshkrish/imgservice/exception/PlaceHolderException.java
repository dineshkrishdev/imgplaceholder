package com.dineshkrish.imgservice.exception;

/**
 * 
 * @author Dinesh Krishnan - dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

public class PlaceHolderException extends Exception {

	/**
	 * 
	 */
	public PlaceHolderException() {

	}

	/**
	 * 
	 * @param message
	 */
	public PlaceHolderException(String message) {

		super(message);
	}

	/**
	 * 
	 * @param throwable
	 */
	public PlaceHolderException(Throwable throwable) {

		super(throwable);
	}

	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public PlaceHolderException(String message, Throwable throwable) {

		super(message, throwable);
	}

}
