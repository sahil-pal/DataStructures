package DataStructures.Arrays;

import java.util.*;

public class que_10 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Strings to be added : ");
		int n = sc.nextInt();
		
		String[] array = new String[n];
		System.out.println("Start entering the elements : ");
		
		for(int i = 0; i < n ; i++) {
			array[i] = sc.next();
		}
		
		int j = array.length - 1;
		int flag = 0;
		for(int i = 0; i < n ; i++ ) {
			if(array[i].equals(array[j])) {
				
			}
			else {
				flag = 1;
			}
			j--;
		}
		
		if(flag == 0) {
			System.out.println("--> The given array is a Palindrome.");
		}
		else {
			System.out.println("--> The given array is not a Palindrome.");
		}
	}
}
