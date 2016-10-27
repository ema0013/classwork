package arrays;

public class ArrayTest {

	public static void main(String[] args) {
	int[]arr = {1,2,3,4,5,6,7,8,9,10};
	printArr(arr);
	int[]test = randArr(arr);
	printArr(test);
	}
	public static int[] randArr(int[]arr){
		int[]randArr = new int [arr.length-4];
		for(int i = 0;i<arr.length;i++){
			int newNum = arr[(int)Math.random()*arr.length+1];
			while(arrayContains(arr,newNum)){
				newNum = arr[(int)Math.random()*arr.length+1];
			}
			randArr[i] = newNum;
		}
		return randArr;
	}
	private static boolean arrayContains(int[] arr, int num) {
		for(int a : arr){
			if (a==num){
				return true;
			}
		}
		return false;
	}
	public static void printArr(int[] arr){
		for(int a:arr){
			System.out.print(a);
			System.out.print(" ");
		}
	}
}
