package com.dineshkrish.imgplaceholder.util;

import java.util.regex.Pattern;

import com.dineshkrish.imgplaceholder.exception.ImgPlaceHolderException;
import com.dineshkrish.imgplaceholder.pojo.ImageProperties;
import com.dineshkrish.imgplaceholder.pojo.UserInput;

public class PlaceholderUtils {

	public static void validate(UserInput input) throws ImgPlaceHolderException {
		
		if(input != null && input.getImageSize() != null && input.getImageSize().isEmpty()) {
			
		}
		
		//if(!checkPatern(imageSize))
			//throw new ImgPlaceHolderException();
		
	}
	
	private static boolean checkPatern(String data) {
		
		String regex = "[0-9]{1,4}x[0-9]{1,4}";
		
		return Pattern.matches(regex, data);
	}
	
	public static ImageProperties constructImgProperties(UserInput input) {
		
		return null;
	}
	
}
