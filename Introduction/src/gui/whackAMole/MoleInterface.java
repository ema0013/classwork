/**
 * 
 */
package gui.whackAMole;

import gui6.components.Action;
import gui6.components.Clickable;

/**
 * @author Student 6
 * This is for my partner, the Enemy Designer to implement
 *
 */
public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearancetime(int screenTime);

	void setAction(Action action);

}
