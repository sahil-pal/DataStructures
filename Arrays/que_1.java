package DataStructures.Arrays;

import java.util.*;

public class que_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		// taking input from the user : size of the array 
		System.out.println("Enter the size of the array : ");
	
		int n = sc.nextInt();
	
		// taking input from the user : elements of the array
		System.out.println("Enter elements :");
	
		int[] array = new int[n];
	
		for(int i = 0; i < n; i++) {
		
			array[i] = sc.nextInt();
		}
	
		// sorting the array 
		//Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
		for(int j = 0; j < array.length-1; j++){
			if(array[i] < array[j]) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		}
		}
	
		System.out.println();
		for(int i : array) {
			System.out.println(i);
		}
	
		// smallest element will be first element and largest element will be the last element
	
		int difference = (array[n-1] - array[0]);
	
		System.out.println("Difference = "+difference);

	}
}
