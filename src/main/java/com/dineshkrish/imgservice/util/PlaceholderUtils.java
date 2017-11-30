package com.dineshkrish.imgservice.util;

import java.util.regex.Pattern;

import com.dineshkrish.imgservice.exception.ImgPlaceHolderException;
import com.dineshkrish.imgservice.pojo.ImageProperties;
import com.dineshkrish.imgservice.pojo.UserInput;

/**
 * 
 * @author Dinesh Krishnan, dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

public class PlaceholderUtils {

	/**
	 * 
	 * @param input
	 * @throws ImgPlaceHolderException
	 */
	public static void validate(UserInput input) throws ImgPlaceHolderException {

		if (input == null || input.getImageSize() != null && input.getImageSize().isEmpty()) {
			throw new ImgPlaceHolderException();
		}

		if (!checkPatern(input.getImageSize())) {
			throw new ImgPlaceHolderException();
		}

	}

	/**
	 * 
	 * @param data
	 * @return
	 */
	private static boolean checkPatern(String data) {

		return Pattern.matches(ApplicationConstant.IMAGE_SIZE_REGEX, data);
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	public static ImageProperties constructImgProperties(UserInput input) {

		String[] str = input.getImageSize().split("x");

		ImageProperties properties = new ImageProperties();

		properties.setWidth(Integer.parseInt(str[0]));
		properties.setHeight(Integer.parseInt(str[1]));

		return properties;
	}

}
