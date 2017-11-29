package com.dineshkrish.imgplaceholder.api;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Testing {

	public static void main(String[] args) {

		int width = 300;
		int height = 300;
		// create buffered image object img
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		// file object
		File f = null;
		// create random image pixel by pixel
		
		Graphics graphics = img.getGraphics();
        graphics.setColor(Color.LIGHT_GRAY);
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Arial Black", Font.ITALIC, 30));
        
       // graphics.drawString("Dinesh Krishnan", 320/2, 640/2);	
        
        printSimpleString(graphics, width+" X "+height, width, 0, height/2+5);
        
		
		// write image
		try {
			f = new File("Output.png");
			ImageIO.write(img, "png", f);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
	
	
	private static void printSimpleString(Graphics graphics, String s, int width, int XPos, int YPos){
        int stringLen = (int)
        		graphics.getFontMetrics().getStringBounds(s, graphics).getWidth();
        int start = width/2 - stringLen/2;
        graphics.drawString(s, start + XPos, YPos);
 }

}
