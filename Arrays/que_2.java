package DataStructures.Arrays;

import java.util.*;

public class que_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// for iteration of program, creating a local variable
		String choice;
		
		do {
		int[] array = new int[10];
		
		// taking input from the user : elements of the array
		System.out.println("Enter elements : ");
		
		for(int i = 0; i < 10; i++) {
			
			array[i] = sc.nextInt();
		}
		
		// output 1 : elements at the even index
		
		System.out.println("Elements at the even index : ");
		for(int i : array) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// output 2 : elements at the odd index
		
		System.out.println("Elements at the odd index : ");
		for(int i : array) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// output 3 : elements in reverse order
		
		System.out.println("Reverse order : ");
		for(int i = (array.length-1); i >= 0; i--) {
			System.out.println(array[i]);
		}
		
		// output 4 : print first and the last element
		
		System.out.println("first element of the array : "+array[0]);
		System.out.println("last element of the array : "+array[array.length-1]);
		
		
		// ask the user to continue the program 
		System.out.println(" Do you want to continue : ");
		choice = sc.next();
		
		
		}while(choice == "Y");
		

	
		}
}
