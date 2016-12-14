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
	
	public Color getColor(){
		return this.color;
	}
	
	public void setColor(Color c){
		this.color = c;
		update();
	}
	
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0,0, getWidth(),getHeight(), 28, 28);
		g.setColor(Color.black);
		g.drawRoundRect(1,1,getWidth()-2,getHeight()-2, 28, 28);
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
		if(getText()!= null){
			g.setColor(Color.white);
			g.drawString(getText(),4,getHeight()-5);
		}

	}

	@Override
	public boolean isHovered(int x, int y) {
		return x>getX() && x<getX()+getWidth() && y > getY() && y<getY()+getHeight();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		action.act();
	}

}
