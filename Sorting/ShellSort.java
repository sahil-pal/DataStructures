package Sorting;

public class ShellSort {
	
	public static void shellSort(int[] array) {
		
		for(int gap = array.length/2; gap > 0; gap /= 2) {
			for(int i = gap; i < array.length; i++ ) {
				int value = array[i];
				int hole = i;
				while(hole >= gap && array[hole] < array[hole-gap]) {
					array[hole] = array[hole-gap];
					hole = hole - gap;
				}
				array[hole] = value;
			}
		}
		
		
	}
	
	public static void printArray(int[] array) {
		for(int value : array) {
			System.out.println(value);
		}
	}

	public static void main(String args[]) {
		
		int[] array = {34,21,54,76,2,-21,43,93};
		
		shellSort(array);
		
		printArray(array);
		
	}
}
