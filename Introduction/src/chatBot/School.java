package chatBot;

public class School implements Topic {
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk(){
		inSchoolLoop = true;
		while(inSchoolLoop){
			EdwinMain.print("Tell me about school.");
			schoolResponse = EdwinMain.getInput();
			if(schoolResponse.indexOf("stop")>=0){
				inSchoolLoop = false;
				EdwinMain.talkForever();
			}
			else{
				EdwinMain.print("That's my favorite part about school too.");
			}
		}
	}

	public boolean isTriggered(String userInput) {
		//String [] triggers = {"school","class","teacher"};
		// you could you use a for loop to iterate through an array
		if(EdwinMain.findKeyWord(userInput, "school", 0) >=0 ){
			return true;
		}
		if(EdwinMain.findKeyWord(userInput, "class", 0) >=0 ){
			return true;
		}
		return false;
	}
}
