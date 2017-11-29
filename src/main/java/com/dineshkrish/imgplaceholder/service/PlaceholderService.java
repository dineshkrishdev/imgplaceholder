package com.dineshkrish.imgplaceholder.service;

import java.io.OutputStream;

import com.dineshkrish.imgplaceholder.core.ImageEngine;
import com.dineshkrish.imgplaceholder.exception.ImgPlaceHolderException;
import com.dineshkrish.imgplaceholder.pojo.UserInput;
import com.dineshkrish.imgplaceholder.util.PlaceholderUtils;

public class PlaceholderService {
	
	public void createPlaceHolder(OutputStream outputStream, UserInput input) throws ImgPlaceHolderException {
		
		PlaceholderUtils.validate(input);
		
		ImageEngine engine = new ImageEngine();
		
		engine.render(PlaceholderUtils.constructImgProperties(input), outputStream);
		
	}
	
}
