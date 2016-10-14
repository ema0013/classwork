package arrays;

public class ArrayMain {

	public static void main(String[] args) {
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has a number equal to "+sample.getNumber());
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " +(endTime-startTime)+ " milliseconds");
	}
	
	private static void printArray(String[] a) {
		for(String s: a){
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
}