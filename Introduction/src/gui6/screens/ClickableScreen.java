package gui6.screens;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui6.Screen;
import gui6.components.Action;
import gui6.components.ClickableGraphic;
import gui6.components.Visible;

public class ClickableScreen extends Screen implements MouseMotionListener,MouseListener{
	
	private ClickableGraphic pic;

	public ClickableScreen(int width, int height) {
		super(width, height);

	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		pic = new ClickableGraphic(500,30,200,200,"resources/sampleImages/plumbus.jpg");
		pic.setAction(new Action(){
			public void act(){
				
			}
		});

	}

	public MouseListener getMouseListener(){
		return this;
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
