package sortingAlgorithm;

import arrays.SampleElement;

public class ComputeTimes {

	public static void main (String[] args){
		trackTime();

	}

	public static void trackTime(){
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " +(endTime-startTime)+ " milliseconds");
	}
	
	public double getAverage(double[] values){
		double sum=0.0;
		for(int i = 0; i<values.length; i++){
			sum+=values[i];
		}
		return sum/values.length;
	}
	
	public boolean isPrime(int n){
		boolean prime = true;
		for(int i = 2; i<n; i++){
			if(n%i==0) prime = false;
		}
		return prime;
	}
	
	public boolean isPrime1(int n){
		boolean prime = true;
		for(int i = 2; i<Math.sqrt(n); i++){
			if(n%i==0) prime = false;   
		}
		 return prime;
	}
	
	public boolean isPrime2(int n){
		 boolean prime = true;
		 double sqrt = Math.sqrt(n);
		 for(int i = 2; i<sqrt; i++){
			 if(n%i==0) prime = false;   
		 }
		 return prime;
	}
	
}
