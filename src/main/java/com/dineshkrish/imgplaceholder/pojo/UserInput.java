package com.dineshkrish.imgplaceholder.pojo;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class UserInput {

	@PathParam("imageSize")
	private String imageSize;

	@QueryParam("color")
	private String color;

	@QueryParam("text")
	private String text;

	public String getImageSize() {
		return imageSize;
	}

	public void setImageSize(String imageSize) {
		this.imageSize = imageSize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		
		return "";
	}

}
