package gui.whackAMole;

import java.util.ArrayList;

import gui6.components.Action;
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
		//when making simon, creating a thread like this is necessary
		//since simon's screen changes
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350,220,100,40,"Sample Text");
		timeLabel = new TextLabel(360,40,80,40,"30.0");

		viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}

	/**
	 *to implement later, after Character Team implements PlayerInterface
	 */
	private PlayerInterface getAPlayer() {
		return new Player();
	}

	/**
	 *to implement later, after EnemyTeam implements MoleInterface
	 */
	private MoleInterface getAMole() {
		return new Mole((int)(Math.random()*getWidth()),(int)(Math.random()*getHeight()));
	}
	public void run(){
		changeText("Ready...");
		changeText("Set...");
		changeText("Go!");
		changeText("");
		//since this is time attack mode, we will use a while loop
		//not necessary for games that aren't timed(like Simon)
		while(timeLeft>0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}
	
	private void appearNewMole() {
		double chance = .1*(60-timeLeft)/60;
		if(Math.random()<chance){
			final MoleInterface mole = getAMole();
			mole.setAppearancetime((int)(500+Math.random())*2000);
			//tell the mole what to do when clicked
			mole.setAction(new Action(){
				public void act() {
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
					
				}
				
			});
			addObjects(mole);
			moles.add(mole);
		}
		
	}

	private void updateAllMoles() {
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime()-100;
			m.setAppearancetime(screenTime);
			if(m.getAppearanceTime()<=0){
				remove(m);
				//remove from screen
				moles.remove(m);
				i--;
				//compensate for mole removed from ArrayList
			}
		}
		
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft-= .1;
		//.1 is not clean binary number. to fix output cast it.
		timeLabel.setText(""+(int)(timeLeft*10)/10.0);
	}
	//use this method in Simon too!
	private void changeText(String string){
		label.setText(string);
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}