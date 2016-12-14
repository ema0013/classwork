package gui.Screens;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen {
	
	private Button button;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		TextLabel text = new TextLabel(20,200,500,40,"Some text");
		button = new Button(50,40,90,90,"CLICK ME",Color.CYAN,new Action(){
			public void act(){
				
			}
		});
		viewObjects.add(text);
		viewObjects.add(button);
	}

}
