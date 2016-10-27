package arrays;

public class SampleElement {
	private int number;
	
	//constructor
	public SampleElement(int value){
		number = value;
	}
	
	public int getNumber(){
		return number;
	}
	//this method increases the value of the FIELD number
	public void increase(){
		//int x = number;
		//x++;
		number++;
	}
	
	
	public static int longestSharedSequence(int[] array1, int[] array2){
		int count = 1;
		int longestSequence = 1;
		for(int i=0;i<array1.length;i++){
			for(int j =0;j<array2.length;j++){
				boolean inLoop  = true;
				int inc = 1;
				if(array1[i]==array2[j]){
					while(inLoop){
						if(inc+i<array1.length && inc+j<array2.length && array1[inc+i]==array2[inc+j]){
							inc++;
							count++;
						}
						else{
							inLoop = false;
							if(count>longestSequence){
								longestSequence = count;
								count = 0;
							}
						}
					}
				}
			}
			
		}
		return longestSequence;
	}
}
