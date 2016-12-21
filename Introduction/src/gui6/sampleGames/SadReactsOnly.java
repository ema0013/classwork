package gui6.sampleGames;

import java.util.ArrayList;

import gui6.Screen;
import gui6.components.Graphic;
import gui6.components.Visible;

public class SadReactsOnly extends Screen {

	private Graphic sadreact; 
	
	public SadReactsOnly(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		sadreact = new Graphic(100,100,"resources/sampleImages/sadreactsonly.png");
		viewObjects.add(sadreact);

	}

}
