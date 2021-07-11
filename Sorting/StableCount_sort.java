package Sorting;

public class StableCount_sort {

	public static void StableCount(int[] input, int[] count) {
		
		// counting the values
		for(int value : input) {
			count[value]++;
		}
		
		// arranging the count array 
		for(int j = 1;j < count.length;j++) {
			count[j] += count[j-1];
		}
		
		// stabling the sort
		int[] temp = new int[input.length];
		for(int i = temp.length-1; i >= 0 ; i--) {
			temp[--count[input[i]]] = input[i];
		}
		
		// copying back to original input
		System.arraycopy(temp, 0, input, 0, input.length);
		
		printArray(input);
		
	}
	
	public static void printArray(int[] input) {
		for(int num : input) {
			System.out.println(num);
		}
	}
	
	public static void main(String args[]) {
		
		int range = 5;
		int[] array = {1,5,2,3,2};
		int[] count = new int[range+1];
		
		for(int i =0; i < count.length; i++) {
			count[i] = 0;
		}
		
		StableCount(array,count);
		
	}
}
