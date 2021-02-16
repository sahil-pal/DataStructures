package DataStructures.Arrays;

import java.util.*;

public class que_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// taking input from the user : size of the array 
		int n = sc.nextInt();
		
		// taking input from the user : elements of the array
		int[] array = new int[n];
		
		System.out.println("Enter elements : ");
		for(int i = 0; i < n ; i++) {
			array[i] = sc.nextInt();
		}
		
		// taking input form the user : element to be searched
		System.out.println("Enter the element to be searched :");
		int find  = sc.nextInt();
		int count = 0;
		
		for(int i : array) {
			if(i == find) {
				count++;
			}
			else {
				
			}
		}
		
		System.out.println("Frequency of searched element in the array : "+count);
		
		}
}
