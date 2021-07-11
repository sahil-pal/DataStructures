package SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static int iterativeBinarySearch(int[] input, int x) {
		int start = 0;
		int end = input.length;
		
		while(start < end) {
			int mid = (start+end)/2;
			
			if(input[mid] == x) {
				return mid;
			}
			else if(input[mid] < x) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] input, int x,int start, int end) {
		
		if(start >= end) {
			return -1;
		}
		
		int mid = (start+end)/2;
		if(input[mid] == x) {
			return mid;
		}
		else if(input[mid] < x) {
			start = mid+1;
			return recursiveBinarySearch(input,x,start,end);
		}
		else {
			end = mid;
			return recursiveBinarySearch(input,x,start,end);
		}
	}

	
	public static void main(String args[]) {
		
		int[] array = {2,4,6,7,-2,9,3,-3};
		Arrays.sort(array);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer to be searched : ");
		int searchedElement = sc.nextInt();
		
		//int index = iterativeBinarySearch(array,searchedElement);
		int index = recursiveBinarySearch(array,searchedElement,0,array.length-1);
		
		if(index != -1) {
			System.out.println("Integer "+searchedElement+" found @t index : "+index);
		}
		else {
			System.out.println("Integer not found!");
		}
		
	}
}
