package loginInfo;

import java.util.Scanner;
public class LoginInfo {

	static Scanner input = new Scanner(System.in);

	public static String waitForEntry(){
		return input.nextLine();
	}

	//1 point for private or inaccessible
	//1 point for declaration of data type(String)
	private static String username = "test_user";
	private static String password = "test";

	//1 point correct method header
	public static void main(String[] args){
		// 1 point if user has ONLY one chance to enter user name
		if(correctUser()){
			askPassword();
		}
		else{
			System.out.println("Unknown username, please contact network administrator.");
		}
	}

	private static boolean correctUser(){
		System.out.println("Enter Username.");
		// 1 point using .equals
		return (waitForEntry().equals(username));
	}

	private static void askPassword(){
		boolean inLoop = true;
		int remainingTries = 3;
		// 1 point, using a loop
		while(inLoop){
			System.out.println("Enter Password.");
			//1 point for waitForEntry()
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You are in!");
				inLoop = false;
			}
			else{
				remainingTries--;
				// .5 point 3 tries MAX
				//.5 "invalid password" after 3
				if(remainingTries == 0){
					System.out.println("Invalid password.");
					inLoop = false;
				}
				else{
					//.5 half point for changing number
					//.5 if correct number
					System.out.println("Incorrect password.You have "+remainingTries+" tries left." );
				}
			}
		}
	}
}
