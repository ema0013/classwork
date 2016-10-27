package codeboard;

import java.lang.reflect.Array;

public class ArrayMethods {
	public static void main(String[] args) {

		/**
		 * IMPORTANT NOTE: 
		 * This homework assignment will be weighted 4x.
		 * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
		 * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
		 * DO NOT spend hours and hours trying to fix perfect code just because my test
		 * says that it isn't perfect!
		 * */
		int[] arr1 = {9,2,1,6,2,4,3,9};
		int[] arr2 = {9,6,1,4,3,6,7,9};
		generateDistinctItemsList(15);
	}

	public static int searchUnsorted(int[] arrayToSearch, int key){
		for(int i = 0; i < arrayToSearch.length; i++){
			if(arrayToSearch[i] == key)
				return i;
		}
		return -1;
	}

	public static int searchSorted(int[] sortedArrayToSearch, int key){
		/**
		 * this method is exactly like the one above, except the parameter sortedArrayToSearch will
		 * always be sorted in DESCENDING order. Again return the index of the key or return -1
		 * if the key is not in the array
		 * 
		 * Note: You should attempt to write a method that is more efficient that searchUnsorted
		 * */
		int min = 0;
		int max = sortedArrayToSearch.length;
		int avg = 0;
		while(!(avg==max&&min==max-1)){
			avg = (max+min+1)/2;
			if(checkHalfWay(sortedArrayToSearch,key,min,max)){
				min = avg;
			}
			else{
				max = avg;
			}
		}
		if(key == sortedArrayToSearch[max]){
			return max;
		}
		return -1;
	}
	private static boolean checkHalfWay(int[] arr, int key, int begin, int end) {
		int middle = ((end+begin+1)/2);
		return key<arr[middle];
	}

	public static boolean isSorted(int[] array){
		for(int index = 0; index < array.length; index ++){
			if(index == array.length-1){
				return true;
			}
			if (array[index] < array[index + 1]){
				return false;
			}
		}
		return true;
	}


	public static double[] getStats(double[] array){
		/** 
		 * This method return a double[] contain a WHOLE BUNCH of stats
		 * The double array must keep the following stats about the array parameter:
		 * index 0 = the mean
		 * index 1 = the max
		 * index 2 = the min
		 * index 3 = the median
		 * index 4 = the number of values greater than or equal to the mean
		 * index 5 = the number of values below the mean
		 * */
		double[] stats = new double[6];
		return stats;
	}

	public static void reverseOrder(int[] array){
		int frontCount = -1;
		for(int index = array.length-1; index > 0; index --){
			frontCount++;
			if((frontCount<index)){
				int replacement1 = array[index];
				array[index] = array[frontCount];
				array[frontCount] = replacement1;
			}
		}
	}

	public static int countDifferences(int[] array1, int[] array2){
		/**Here, you will write an method that returns the number of values in two arrays 
		 * that are NOT the same (either in value OR location).
		 * The arrays ALWAYS have the same length
		 * Examples:
		 * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
		 * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
		 * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
		 * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
		 * 
		 * */
		int differenceCount = 0;
		for(int i = 0; i < array1.length; i ++){
			if(!(array1[i]==array2[i])){
				differenceCount ++;
			}
		}
		return differenceCount;
	}


	public static int longestConsecutiveSequence(int[] array1){
		/**This method counts the longest consequtive sequence in an array.
		 * It does not matter where the sequence begins
		 * If there are no consecutive numbers, the method should return '1'
		 * 
		 * Examples:
		 * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
		 * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
		 * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
		 * */

		int longest = 1;
		for(int i = 0; i < array1.length; i++){
			if(i==array1.length-1)
				break;
			if(array1[i+1] == array1[i]+1){
				int newCount = 2;
				while(!(i+newCount==array1.length)&&array1[i+newCount] == array1[i]+newCount){
					newCount++;
				}
				if(newCount>longest)
					longest = newCount;
			}
		}
		return longest;
	}

	public static int longestSharedSequence(int[] array1, int[] array2){
		/**This method counts the longest unbroken, shared sequence in TWO arrays.
		 * The sequence does NOT have to be a consecutive sequence
		 * It does NOT matter where the sequence begins, the arrays might not be the same length
		 * 
		 * Examples:
		 * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
		 * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
		 *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
		 * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
		 * */
		return 0;
	}
	private static boolean contains(int[] arr,int[] subArr){
		for(int i = 0; i < arr.length; i ++){
			if(arr[i] == subArr[0]){
				int j = 0;
				while(j< subArr.length){
					if(subArr[j] == arr[i + j] && j == subArr.length-1){
						System.out.println("It matches!");
						return true;
					}
					else if (subArr[j]!= arr[i+j]){
						System.out.println("No match at "+(i+j)+"!");
						break;
					}
					j++;
				}
			}
		}
		return false;
	}

	public static int[] generateDistinctItemsList(int n){
		/**
		 * This method needs to generate an int[] of length n that contains distinct, random integers
		 * between 1 and 2n 
		 * The method will be tested by verifying that the array you return is n items long,
		 * contains only entries between 1 and 2n (inclusive) and has no duplicates
		 * 
		 * */
		 int[] array = new int [n];
         for(int i = 0; i < array.length; i ++){
            int nextNumber = (int)(Math.random()*(2*n)+1);
            while(isInArray(array,nextNumber)){
            }
            array[i] = nextNumber;
         }
        return array; 
	}

	private static boolean isInArray(int[] arr, int key){
        for(int a: arr){
            if(a==key)
                return true;
        }
        return false;
    }
	
	public static void cycleThrough(int[] array, int n){
		/** This problem represents people moving through a line.
		 * Once they get to the front of the line, they get what they've been waiting for, then they 
		 * immediately go to the end of the line and "cycle through" again.
		 * 
		 * This method reorders the array so that it represents what the array would look like
		 * after it had been cycled through an n number of times.
		 * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
		 * because '2' (the person at the front of the line) cycled through and is now at the end of the line
		 * 
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
		 * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
		 * 
		 * Likewise,
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
		 * and the most interesting case, 
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
		 * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
		 * was able to go through one more time than anyone else
		 * 
		 * CHALLENGE
		 * For extra credit, make your method handle NEGATIVE n
		 * */
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
	private static void swap(int[] arr,int index1,int index2){
		int placeHolder = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = placeHolder;
	}

	
	private static void print(int[]arr){
		for(int a:arr){
			System.out.print(a +" ");
		}
		System.out.println("");
	}
}
