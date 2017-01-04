package gui.whackAMole;

import java.util.ArrayList;

import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;
import gui.whackAMole.WhackAMoleGame;

public class WhackAMoleScreen extends ClickableScreen {

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30;
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350,220,100,40,"Sample Text");
		timeLabel = new TextLabel(360,40,80,40,"30.0");

		//		viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}

	/**
	 *to implement later, after Character Team implements PlayerInterface
	 */
	private PlayerInterface getAPlayer() {
		return null;
	}

	/**
	 *to implement later, after EnemyTeam implements MoleInterface
	 */
	private MoleInterface getAMole() {
		return null;
	}
	public void run(){
		changeText("Ready...");
		changeText("Set...");
		changeText("Go!");
		changeText("");
	}
	
	private void changeText(String string){
		label.setText(string);
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
