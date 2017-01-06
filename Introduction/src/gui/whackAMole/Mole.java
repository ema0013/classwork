package gui.whackAMole;

import gui6.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y,.3, "resources/sampleImages/gabe.png");
	}

	@Override
	public int getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppearancetime(int screenTime) {
		appearanceTime = screenTime;

	}

}
