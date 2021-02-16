package DataStructures.Arrays;

import java.util.*;

public class que_6 {
	public static void main(String[] args) {
		
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
				
				//counting the frequency of two 6's and 7 after the 6
				int count = 0;
				
				for(int i = 0 ; i < n ; i++) {
					
					if(array[i] == 6) {
						if(i > 0 && array[i-1] == 6) {
							count++;
						}
						if(i <= (n-2) && array[i+1] == 7){
							count++;
						}
					}
					else {
						
					}
					
				}
				System.out.println("occurence = "+count);

		}
}
