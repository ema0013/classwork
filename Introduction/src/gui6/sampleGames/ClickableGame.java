package gui6.sampleGames;

import gui6.GUIApplication;
import gui6.screens.ClickableScreen;

public class ClickableGame extends GUIApplication implements Runnable{

	//FIELDS
	public static ClickableGame game;
	public static ClickableScreen screen1;
	
	public ClickableGame(int width,int height) {
		super(width,height);
	}
	@Override
	public void initScreen() {
		screen1 = new ClickableScreen(800,600);
		setScreen(screen1);

	}
	public static void main(String[] args) {
		game = new ClickableGame(800,600);
		Thread app = new Thread(game);
		app.start();
	}



}
