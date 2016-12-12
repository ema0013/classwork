package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public abstract class Screen {
	
	private BufferedImage image;
	
	public Screen(int width,int height) {
		initImage(width,height);
	}

	public void initImage(int width, int height) {
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		update();
		
	}

	public void update() {
		Graphics2D g = image.createGraphics();
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
//		g.drawString("Hello World!", 40, 100);
//		g.drawOval(20, 70, 100, 50);
	}
	
	public BufferedImage getImage(){
		return image;
	}
	
	public int getWidth(){
		return image.getWidth();
	}
	
	public int getHeight(){
		return image.getHeight();
	}
}