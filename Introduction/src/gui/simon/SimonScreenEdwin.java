package gui.simon;

import java.awt.Color;
import java.util.ArrayList;

import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class SimonScreenEdwin extends ClickableScreen implements Runnable {
	
	private TextLabel label;
	private ButtonInterfaceEdwin[] buttons;
	private ProgressInterfaceEdwin progress;
	private ArrayList<MoveInterfaceEdwin> sequence;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;

	public SimonScreenEdwin(int width,int height) {
		super(width,height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceEdwin>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
		
	}
	private MoveInterfaceEdwin randomMove() {
		ButtonInterfaceEdwin b;
		int randomButton = (int)(Math.random()*buttons.length);
		while(randomButton==lastSelectedButton){
			randomButton = (int)(Math.random()*buttons.length);
		}
		b = buttons[randomButton];
		return getMove(b);
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceEdwin getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 6;
		Color[] buttonColors = {Color.CYAN,Color.DARK_GRAY,Color.GREEN,Color.MAGENTA,Color.ORANGE,Color.YELLOW};
		for(int i = 0; i < buttonColors.length;i++){
			ButtonInterfaceEdwin b = getAButton();
			b.setColor(buttonColors[i]);
			b.setX(50*i);
			b.setY(40);
		}
	}

}
