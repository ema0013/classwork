package datatypes;

public class RandomCard {

	public static void main(String[] args) {
		String[] cardSuit = {"Diamonds","Clubs","Hearts","Spades"};
		String[] cardRanks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		
		print("You drew the "+cardRanks[pickRank()]+" of "+cardSuit[pickSuit()]+".");

	}
	
	public static int pickSuit(){
		double rand = Math.random();
		int suit = (int)(rand*4);
		return suit++;
	}
	
	public static int pickRank(){
		double rand = Math.random();
		int rank = (int)(rand*13);
		return rank++;
		
	}
	public static void print(String input){
		System.out.println(input);
	}
	
}
