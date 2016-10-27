package arrays;

public class SieveEratosthenes {

	public static void main(String[] args) {
		testPrimes(50);

	}
	public static void testPrimes(int numberToTest){
		int lastToCheck = (int)(Math.sqrt(numberToTest));
		boolean [] theNumbers = new boolean [numberToTest];
		for(int i = 0; i < theNumbers.length;i++){
			theNumbers[i] = true;
		}
		theNumbers[0]=false;
		theNumbers[1]=false;
		int increment = 2;
		boolean first = true;
		for(int test = 2; test < numberToTest;test = test+increment){
			if(!first){
				theNumbers[test] = false;
			}
			else{
				first = false;
			}
		}
		for(int i = 0; i < theNumbers.length; i++){
			if(theNumbers[i]){
				System.out.println(i+" is prime.");
			}
		}
	}

}
