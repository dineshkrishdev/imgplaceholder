package com.dineshkrish.imgplaceholder.core;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import com.dineshkrish.imgplaceholder.pojo.ImageProperties;

public class ImageEngine {

	public void render(ImageProperties properties, OutputStream outputStream) {

		BufferedImage img = new BufferedImage(properties.getWidth(), properties.getHeight(),
				BufferedImage.TYPE_INT_ARGB);

		Graphics graphics = img.getGraphics();

		graphics.setColor(Color.LIGHT_GRAY);

		graphics.fillRect(0, 0, properties.getWidth(), properties.getHeight());

		graphics.setColor(Color.BLACK);

		graphics.setFont(new Font("Arial Black", Font.ITALIC, 30));

		printSimpleString(graphics, properties.getWidth() + " X " + properties.getHeight(), properties.getWidth(), 0,
				properties.getHeight() / 2 + 5);

		try {

			ImageIO.write(img, "png", outputStream);

		} catch (IOException e) {

			System.out.println("Error: " + e);
		}

	}

	private static void printSimpleString(Graphics graphics, String s, int width, int XPos, int YPos) {

		int stringLen = (int) graphics.getFontMetrics().getStringBounds(s, graphics).getWidth();
		int start = width / 2 - stringLen / 2;
		graphics.drawString(s, start + XPos, YPos);
	}

}
