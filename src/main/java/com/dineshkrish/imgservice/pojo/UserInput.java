package com.dineshkrish.imgservice.pojo;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * 
 * @author Dinesh Krishnan, dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

public class UserInput {

	@PathParam("imageSize")
	private String imageSize;

	@QueryParam("color")
	private String color;

	@QueryParam("text")
	private String text;

	/**
	 * 
	 * @return
	 */
	public String getImageSize() {
		return imageSize;
	}

	/**
	 * 
	 * @param imageSize
	 */
	public void setImageSize(String imageSize) {
		this.imageSize = imageSize;
	}

	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public String getText() {
		return text;
	}

	/**
	 * 
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * 
	 */
	public String toString() {

		return "";
	}

}
