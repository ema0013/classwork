package arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = {2,3,4,6,9,11,12,15};
//		swap(arr,0,arr.length-1);d
		shuffle(arr);
		print(arr);
//		if(checkHalfWay(arr,12,0,arr.length-1)){
//			System.out.println("The number you are searching for is less than"
//					+" the value in the middle of the array");
//		}
//		else{
//			System.out.println("The number you are searching for is greater than "
//					+ "the value in the middle of the array");
//		}
	}
	/**
	 * returns true if searchValue is less than element 
	 * halfway between beginning and end
	 * @param arr
	 * @param key
	 * @param min
	 * @param max
	 */
	private static boolean checkHalfWay(int[] arr, int key, int begin, int end) {
		int middle = ((end+begin+1)/2);
		return key<arr[middle];
	}
	
	private static void swap(int[] arr,int index1,int index2){
		 int placeHolder = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = placeHolder;
	}
	
	private static void shuffle(int[] arr){
		for(int i = 0; i < arr.length; i ++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
		}
	}
	
	private static void print(int[]arr){
		for(int a:arr){
			System.out.print(a +" ");
		}
	}
}
