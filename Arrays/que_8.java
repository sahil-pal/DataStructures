package DataStructures.Arrays;

import java.util.*;

public class que_8 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		System.out.println("Start entering the elements : ");
		
		for(int i = 0; i < n ; i++) {
			array[i] = sc.nextInt();
			if(array[i] > 99 && array[i] < 0) {
				System.out.println("Enter input between 0 - 99");
				i--;
			}
			else {
				
			}
		}
		
		Arrays.sort(array);
		
		if(n % 2 == 0) {
			int element1 = (n/2) - 1;
			int element2 = n/2;
			System.out.println("Median is : "+(array[element1]+array[element2]/2));
		}
		else {
			int element = (n/2);
			System.out.println("Median is : "+array[element]);
		}
		
		
	}
}
