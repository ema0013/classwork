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
}
