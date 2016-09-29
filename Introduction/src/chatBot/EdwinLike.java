package chatBot;

public class EdwinLike implements Topic{
	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk(){
		EdwinMain.print("What are some things that you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = EdwinMain.getInput();
			int likePsn = EdwinMain.findKeyWord(likeResponse, "like", 0);
			if( likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				EdwinMain.print("You are such an interesting person because you like "+thingsLiked);
				if(EdwinMain.findKeyWord(thingsLiked, "school", 0) >= 0){
					inLikeLoop = false;
					EdwinMain.school.talk();
				}
				else{
				inLikeLoop = false;
				EdwinMain.talkForever();
				}
			}
			else{
				EdwinMain.print("I don't understand you.");
			}
		}
	}

	public boolean isTriggered(String userInput) {
		if(EdwinMain.findKeyWord(userInput, "like", 0) >=0 ){
			return true;
		}
		return false;
	}
}
