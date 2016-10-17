package arrays;

public class ArrayMain {

	public static void main(String[] args) {
		arrayDemonstration();
	}
	public static void trackTime(){
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		SampleElement sample = new SampleElement(10);
		System.out.println("The sample element has a number equal to "+sample.getNumber());
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " +(endTime-startTime)+ " milliseconds");
	}

	private static void printArray(int [] a) {
		for(int s: a){
			System.out.println(s);
		}
	}

	private static void populateArray(String[] a) {
		for(int index = 0; index < a.length; index++){
			a[index] = "value "+(index+1);
		}
	}
	//passes element, not the array. NO CHANGE WILL BE MADE	
	private static void changeString(String s){
		s = "This string has been changed!";
	}

	private static void changeArray(String[] someStrings){
		someStrings = new String[100];
		for(int i = 0; i < someStrings.length; i ++){
			someStrings[i] = "new item "+(i+1);
		}
	}

	private static void changeArrayElement(String[] someStrings,int i){
		someStrings[i] = "new item "+(i+1);
	}

	private static void passByValueInformation(){
		String [] someStrings = new String[100];
		populateArray(someStrings);
		System.out.println("Before \"changeArray\" method "+someStrings[99]);
		changeArray(someStrings);
		System.out.println("After \"changeArray\" method "+someStrings[99]);
		changeArrayElement(someStrings,99);
		System.out.println("After \"changeArrayElement\" method "+someStrings[99]);
	}
	public static void arrayIntroMethod(){
		//construct two integer arrays
		//these two methods do the same thing
		//primitive type arrays fill with ZEROES 0,0.0,false
		int[] zeros1 = {0,0};
		int[] zeros2 = new int[3];

		//example
		boolean[] booleans = new boolean[3];
		//iterate two ways
		//FOR LOOP
		//WHEN TO USE 
		// - the index of the data is important to reference 
		// - you need to customize how you iterate
		//(increase by 2, backwards,etc...)
		for (int i = 0; i < booleans.length;i++){
			System.out.println(i+")"+booleans[i]);
		}
		//SECOND METHOD: FOR-EACH
		//always goes in order, doesn't keep track of index
		//easier to type
		for(boolean b: booleans){
			System.out.println(""+b);
		}


		//these two constructors are different
		String[] strings1 = {"","",""};
		String[] strings2 = new String[3];

		for(String s: strings1){
			System.out.println(s);
		}

		for(int index = 0; index < strings2.length; index++){
			strings2[index] = "value "+(index+1);
		}
		for(String s: strings2){
			System.out.println(s);

		}
	}
	private static void populateArrayNum(int[] a) {
		for(int index = 0; index < a.length; index++){
			a[index] =(index+1);
		}
	}
	private static void randomPopulate(int [] a){
		for (int index = 0; index < a.length; index++){
			a[index] = (int)(Math.random()*50)+1;
		}
	}
	private static int rollDie(){
		return (int)(Math.random()*6)+1;
	}
	public static void arrayDemonstration(){
		int[]numbers = new int[50];
		populateArrayNum(numbers);
		printArray(numbers);

		int[]randomNumbers = new int [20];
		randomPopulate(randomNumbers);
		printArray(randomNumbers);
		
		int[]dieRolls = new int [10000];
		int[]results = new int [11];
		for(int i = 0; i < dieRolls.length; i ++)
		{
			dieRolls[i] = rollDie()+rollDie();
			results[(dieRolls[i]-2)]++;
		}
		for (int i = 0; i < 11; i ++){
			int percentage = (int)((double)results[i]/10000*100);
			System.out.println((i+2)+" was rolled "+percentage+"% of the time.");
		}
		
		String[] cardSuit = {"Diamonds","Clubs","Hearts","Spades"};
		String[] cardRanks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		
		for(int suit = 0; suit < cardSuit.length;suit++){
			for (int rank = 0; rank < cardRanks.length; rank++){
				System.out.println(cardRanks[rank] + " of " + cardSuit[suit]);
			}
		}
		
	}
}