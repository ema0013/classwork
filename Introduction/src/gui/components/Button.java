package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable {
	
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.action = action;
		update();
	}
	
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(color);
		g.drawRoundRect(getX(),getY(),getWidth(),getHeight(), 28, 28);
		g.fillRoundRect(getX(),getY(), getWidth(), getHeight(), 28, 28);
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
		g.setColor(Color.black);
		if(getText()!= null){
			g.drawString(getText(),4,getHeight()-5);
		}

	}

	@Override
	public boolean isHovered(int x, int y) {
		if(getX()+getWidth()-x<0)
			return false;
		if(getY()+getHeight()-y<0){
			return false;
		}
		return true;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		action.act();
	}

}
