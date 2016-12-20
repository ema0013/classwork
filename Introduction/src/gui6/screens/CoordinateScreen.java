package gui6.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui6.Screen;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.components.Action;
import gui6.components.Button;
import gui6.components.TextArea;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private Button button;
	private TextLabel text;
	private TextArea test;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		button = new Button(200,200,80,40,"Button",new Color(100,100,250),new Action() {
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int mx = e.getX();
		int my = e.getY();
		text.setText("Mouse at "+mx+", "+my);
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	
	
	
	
	
	
	
	
	
	
	
}
