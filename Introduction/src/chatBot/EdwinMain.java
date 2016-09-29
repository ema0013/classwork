package chatBot;

import java.util.Scanner;

public class EdwinMain {
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;
	static Topic like;
	static Topic hello;

	public static void main(String[] args) {
		createTopics();
		promptName();
		talkForever();
	}

	public static void promptName() {
		print("Hello human! I am a board covered with semi-conductors and other such electronic components.What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you "+user+" until you terminate me.");

	}

	public static void talkForever(){
		inLoop = true;
		while (inLoop){
			print("Greetings "+user+". How are you?");
			response = getInput();
			if(findKeyWord(response,"good",0) >= 0){
				print("I'm so happy you're good.");
			}
			else if (like.isTriggered(response)){
				inLoop = false;//exit this loop
				like.talk();
			}
			else if (school.isTriggered(response)){
				inLoop = false;
				school.talk();
			}
			else if (hello.isTriggered(response)){
				inLoop = false;
				hello.talk();
			}
			else	
				print("I'm sorry. I don't understand you.");
		}
	}

	public static int findKeyWord(String searchString, String key, int startIndex) {
		//delete white space
		String phrase = searchString.trim();
		//set all letters to lower case
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		//find position of key
		int psn = phrase.indexOf(key);
		//keep looking for word until you find the right context
		while(psn >=0 ){
			String before = " ";
			String after = " ";
			// if phrase doesn't end with this word
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length() + 1);
			}
			//if the phrase doesn't begin with this word
			if(psn > 0){
				before = phrase.substring(psn-1,psn);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				if(noNegations(searchString,psn)){
					return psn;
				}
			}
			// in case keyword wasn't found yet, repeat and check the rest of string
			psn = phrase.indexOf(key,psn+1);
		}
		return -1;
	}
	//helper method. Contributes functionality to another method
	//help make methods more readable
	//private method, only used by the method it helps
	private static boolean noNegations(String phrase, int index) {
		//check for word "NO" (3 characters)
		//check to see if there is space for the word "NO " to be in front of the index
		if(index - 3 >= 0 && phrase.substring(index-3,index).equals(("no "))){
			return false;
		}
		//check for "not "
		if(index - 4 >= 0 && phrase.substring(index-4,index).equals(("not "))){
			return false;
		}
		//check for "never "
		if(index - 6 >= 0 && phrase.substring(index-6,index).equals(("never "))){
			return false;
		}
		//check for "n't "
		if(index -  4 >= 0 && phrase.substring(index-4,index).equals(("n't "))){
			return false;
		}
		return true;
	}

	public static void promptInput() {
		print("Try inputting a string!");
		String userInput = input.nextLine();
		print("You typed: "+userInput);

	}

	public static String getInput(){
		return input.nextLine();
	}

	public static void print(String s) {
		//create a multi-line string
		String printString = "";
		int cutOff = 35;
		//check to see if there are words to add
		//if length of s>0
		while(s.length()>0){
			String currentLine = "";
			String nextWord = "";
			//while the current line and the next word < cutoff & there are still words to add, do the following
			while((currentLine.length()+nextWord.length() <= cutOff) && (s.length()>0)){
				//add the next word to the line
				currentLine += nextWord;
				//remove word from s
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord=s.indexOf(" ");
				//check to see if last word
				if (endOfWord == -1)
					endOfWord = s.length()-1;				
				nextWord = s.substring(0,endOfWord+1);
			}
			printString += currentLine + "\n";
		}

		System.out.println(printString);

	}

	public static void createTopics() {
		input = new Scanner(System.in);
		school = new School();
		like = new EdwinLike();
		hello = new EdwinHello();

	}


}
