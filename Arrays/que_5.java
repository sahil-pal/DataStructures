package DataStructures.Arrays;

import java.util.*;

public class que_5 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[3][3];
		
		// taking input from the user : elements of the array
		System.out.println("Enter two - digit number as input : ");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
			int temp = sc.nextInt();
			// setting condition for the input to be two digit number
			if(temp < 100) {
				array[i][j] = temp;
			}
			else {
				System.out.println("Re - enter the input ");
				j--;
			}
			}
		}
		
		
		// output 1 : printing entered elements 
		System.out.println("2-D array : ");
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
			System.out.print(array[i][j]+" ");
			
			}
			System.out.println();
		}
		System.out.println();
		
		
		//output 2 : elements multiplied by 2 if they are odd
		System.out.println("Modified 2-D array : ");
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
			if(array[i][j] % 2 != 0) {
				System.out.print((array[i][j]*2)+" ");
			}
			else {
				System.out.print((array[i][j])+" ");
				continue;
			}
			
		}
			System.out.println();
		
	}


	}
}
