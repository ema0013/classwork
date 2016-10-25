package arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = {2,3,4,6,9,11,12,15};
//		swap(arr,0,arr.length-1);d
		print(arr);
		cycleThrough(arr,1);
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
	 * returns number of elements in arr less than d
	 * @param arr
	 * @param d
	 */
	public static int countUnderBound(double[] arr, double d){
		int total = 0;
		for(double a:arr){
			if(a<d)
				total++;
		}
		return total;
	}
	
	public static void cycleThrough(int[] array, int n){
		for(int i = 0; i < n; i ++){
			cycleOnce(array);
		}
	}
	private static void cycleOnce(int[] array){
		for(int j = 0; j<array.length-1;j++){
			if(j == 0){
				swap(array,array.length-1,j);
			}
			if(j == array.length-2){
				return;
			}
				swap(array,j,j+1);
		}
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
