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
}
