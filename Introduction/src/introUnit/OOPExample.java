/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 * This class is designed to contrast with the  Procedural Example.
 * It embodies an Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a new student 
		Student jillian = new Senior("Jillian","McDonalds Employee");
		Student jordan = new Junior("Jordan","Archery");
		Student jason = new Student("Jason");
		jillian.talk();
		jordan.talk();
		jason.talk();
		
	}

}
