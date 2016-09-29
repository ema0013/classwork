package chatBot;

public class EdwinHello implements Topic {

	private boolean inHelloLoop;
	private String helloResponse;
	
	private int helloCount;
	
	//responses are constants
	private static String [] calmResponses = {"We've already said our hellos, remember?",
			"Yes,hello to you too. Lets actually talk now."};
	private static String [] angryResponses = {"Seriously? This has to stop.",
			"You are beginning to ignore me. We've SAID HELLO."};
	
	public EdwinHello(){
		helloCount = 0;
	}
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = EdwinMain.getInput();
			if (helloCount >= 10){
				System.out.println("THATS IT! NO MORE! I'M DONE TALKING WITH YOU!");
				System.exit(0);
			}
			else if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				EdwinMain.talkForever();
			}
		}
		
	}

	private void printResponse(){
		//calm response
		if(helloCount < 5){
			int responseIndex = (int) (Math.random()*calmResponses.length);
			EdwinMain.print(calmResponses[responseIndex]);
		}
		//angry response
		else{
			int responseIndex = (int) (Math.random()*angryResponses.length);
			EdwinMain.print(angryResponses[responseIndex]);
		}
	}
	
	public boolean isTriggered(String userInput) {
		if(EdwinMain.findKeyWord(userInput, "hi", 0) >=0 ){
			return true;
		}
		if(EdwinMain.findKeyWord(userInput, "hello", 0) >=0 ){
			return true;
		}
		return false;
	}
	

}
