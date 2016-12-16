package gui6.screens;

import java.awt.Color;
import java.util.ArrayList;

import gui6.Screen;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.components.Action;
import gui6.components.Button;

public class CoordinateScreen extends Screen {

	private Button button;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = 
				new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		button = new Button(60,200,80,40,"Button",
				new Color(100,100,250),new Action() {
			
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button);
	}


	
	
	
	
	
	
	
	
	
	
	
}
