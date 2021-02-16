package DataStructures.Arrays;

import java.util.*;

public class que_3 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		
		// taking input from the user : elements of the array
		System.out.println("Enter elements : ");
		
		for(int i = 0; i < 5; i++) {
			
			array[i] = sc.nextInt();
		}
		
		// taking choice of the user 
		System.out.println();
		System.out.println(" [1] --> To get the sum of elements in the array.");
		System.out.println(" [2] --> To get the sum of alternate elements in the array.");
		System.out.println(" [3] --> To get the second hoghest element in the array.");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : {
					// output 1 : elements sum
					int sum = 0;
					
					for(int i = 0 ; i < 5 ; i++){
						sum = sum + array[i];
					}
					System.out.println("Sum =  "+sum);
					break;
				}
		
		case 2 : {
					// output 2 : sum of alternate elements
					int sum = 0;
					
					for(int i = 0; i < 5 ; i++) {
						sum = sum + array[i];
						i++;
					}
					System.out.println("Sum =  "+sum);
					break;
				}
		
		case 3 : {
					// output 3 : second highest element
		
					// sorting the array
			
					Arrays.sort(array);
					
					System.out.println("Second highest element = "+array[(array.length-2)]);
					break;
					
				}
		
		default : System.out.println("Invalid choice.");
	


		}
	}
}
