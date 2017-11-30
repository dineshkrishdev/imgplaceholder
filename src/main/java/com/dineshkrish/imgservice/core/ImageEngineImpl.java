package com.dineshkrish.imgservice.core;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import com.dineshkrish.imgservice.exception.ImgPlaceHolderException;
import com.dineshkrish.imgservice.pojo.ImageProperties;
import com.dineshkrish.imgservice.util.ApplicationConstant;

/**
 * 
 * @author Dinesh Krishann - dinesh@dineshkrish.com - http://www.dineshkrish.com
 *
 */

public class ImageEngineImpl implements ImageEngine {

	@Override
	public void render(ImageProperties properties, OutputStream outputStream) throws ImgPlaceHolderException {

		int width = properties.getWidth();
		int heigt = properties.getHeight();

		BufferedImage img = new BufferedImage(width, heigt, BufferedImage.TYPE_INT_ARGB);

		Graphics graphics = img.getGraphics();
		graphics.setColor(Color.LIGHT_GRAY);
		graphics.fillRect(0, 0, width, heigt);
		graphics.setColor(Color.BLACK);
		graphics.setFont(getFont());

		drawString(graphics, width + " x " + heigt, width, 0, heigt / 2 + 5);

		try {

			ImageIO.write(img, ApplicationConstant.IMAGE_FORMAT, outputStream);

		} catch (IOException e) {

			throw new ImgPlaceHolderException();
		}

	}

	/**
	 * 
	 * @return
	 */
	private Font getFont() {

		return new Font(ApplicationConstant.FONT_NAME, Font.ITALIC, ApplicationConstant.FONT_SIZE);
	}

	/**
	 * 
	 * @param graphics
	 * @param s
	 * @param width
	 * @param XPos
	 * @param YPos
	 */
	private void drawString(Graphics graphics, String s, int width, int XPos, int YPos) {

		int stringLen = (int) graphics.getFontMetrics().getStringBounds(s, graphics).getWidth();
		int start = width / 2 - stringLen / 2;
		graphics.drawString(s, start + XPos, YPos);
	}

}
