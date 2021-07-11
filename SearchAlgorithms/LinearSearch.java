package SearchAlgorithms;

import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearching(int[] input,int x) {
		int index = -1;
		for(int i =0; i < input.length; i++) {
			if(input[i] == x) {
				index = i;
			}
			else {
				
			}
		}
		if(index != -1) {
			System.out.println("Integer "+x+" found @t index : "+index);
		}
		else {
			System.out.println("Integer not found!");
		}
	}

	public static void main(String args[]) {
		
		int[] array = {2,4,6,7,-2,9,3,-3};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer to be searched : ");
		int searchedElement = sc.nextInt();
		
		linearSearching(array,searchedElement);
	}
}
