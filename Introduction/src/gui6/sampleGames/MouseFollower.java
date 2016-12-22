package gui6.sampleGames;

import gui6.GUIApplication;
import gui6.screens.CoordinateScreen;
import gui6.screens.SadReactsOnly;

public class MouseFollower extends GUIApplication implements Runnable {

	//FIELDS
	public static CoordinateScreen cs;
	public static MouseFollower game;
	public static SadReactsOnly sad;
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		sad = new SadReactsOnly(getWidth(),getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}








