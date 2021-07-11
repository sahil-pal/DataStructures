package Sorting;

public class RadixSort {

	public static void radixSort(int[] input,int radix,int width) {
		
		for(int position = 0; position < width; position--) {
			SingleRadixSort(input,position,radix);
		}
	}
	
	public static void SingleRadixSort(int[] input, int position, int radix) {
		
		int[] countArray = new int[radix];
		for(int value : input) {
			countArray[getValue(value,position,radix)]++;
		}
		for(int i = 0; i < countArray.length;i++) {
			System.out.println(countArray[i]);
		}
		System.out.println();
		
		// arrange the count
		for(int i = 1; i < countArray.length;i++) {
			countArray[i] += countArray[i-1];
		}
		for(int i = 0; i < countArray.length;i++) {
			System.out.println(countArray[i]);
		}
		
		// stabling the sort
		int[] temp = new int[input.length];
		for(int i = input.length-1; i >= 0 ; i++) {
			temp[countArray[getValue(input[i],position,radix)]] = input[i];
		}
		
		// copying the array
		System.arraycopy(temp,0,input,0,input.length);
	}
	
	public static void printArray(int[] input) {
		for(int value : input) {
			System.out.println(value);
		}
	}
	
	public static int getValue(int number, int position, int radix) {
		return number/(int) Math.pow(10,position) % radix;
	}
	
	public static void main(String args[]) {
		
		int radix = 10;
		int width = 4;
		int[] array = {1234,4589,5786,2988,3449};
		
		radixSort(array,radix,width);
		printArray(array);
	}
}
