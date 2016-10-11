package arrays;

public class ArrayMain {

	public static void main(String[] args) {
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " +(endTime-startTime)+ " milliseconds");
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

		for(String s: strings2){
			System.out.println(s);

		}
	}
}