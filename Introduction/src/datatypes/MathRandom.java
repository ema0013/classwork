package datatypes;

import java.util.Random;
public class MathRandom {

	public static void main(String[] args) {
		int[] results = new int [6];
		// creates an array with [0,0,0,0,0,0]
		int totalRolls = 10000;
		for(int index = 0; index < totalRolls;index ++){
			int roll = rollUnfairDie();
			System.out.println("Roll #"+(index+1)+
					" Die is "+ roll);
			results[(roll-1)]++;
		}
		for (int i = 0; i < 6; i ++){
			int percentage = (int)((double)results[i]/totalRolls*100);
			System.out.println((i+1)+" was rolled "+percentage+"% of the time.");
		}
	}

	public static int rollFairDie(){
		//	Random gen = new Random();
		//	return gen.nextInt(6)+1;
		double rand = Math.random(); //random double (0,1)
		int roll = (int) (rand*6); //[0,5] (this is what above code does)
		return roll+1;
	}
	public static int rollUnfairDie(){
		double rand = Math.random();
		int roll = (int) (rand*6);
		if (roll <= 3){
			double test = Math.random();
			int add = (int) (test*2);
			return (roll+add+1);
		}
		return roll + 1;
	}
}
