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
		for(int prime = 2; prime <= lastToCheck; prime++){
			//when testing 50 numbers;
			//tests 2,3,4,5,6,7 as if prime
			if(theNumbers[prime]){
				//only checks numbers that are prime
				//numbers that haven't been crossed off(true)
				System.out.println("\n" + prime +  " is prime."
						+ " Crossing off:");
				for(int test = prime+prime; test < numberToTest;test = test+prime){
						System.out.print(test+", ");
						theNumbers[test] = false;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < theNumbers.length; i++){
			if(theNumbers[i]){
				System.out.println(i+" is prime.");
			}
		}
	}

}
