package DataStructures.Arrays;

import java.util.*;

public class que_12 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		// declaring the 2-D array
		float[][] sales_table = new float[6][5];
				
		System.out.println("---THIS IS A SALES TABLE PROGRAM---");
				
		boolean choice = true;
				
		// taking input from the user for entries in the sales table
		while(choice != false) {
			System.out.println("Enter the Sales man number : ");
			int j = sc.nextInt();
			System.out.println("Enter the Product number : ");
			int i = sc.nextInt();
			System.out.println("Enter the value : ");
			float value = sc.nextFloat();
				
			sales_table[i-1][j-1] = value;
				
			System.out.println("To continue entry press --> [Y] ");
			System.out.println("To display output press --> [N] ");
				
			String choice1 = sc.next();
			if(choice1.equals("Y") || choice1.equals("y")) {
					
			}
			else {
				choice = false;
			}
		}
				
		// storing the total sale of each product as well as the sale's of a person
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 ; j++) {
				// for total sales of each product
				if(j != 4){
				sales_table[i][4] += sales_table[i][j];
				}// for total sales of each person
				sales_table[5][i] += sales_table[j][i];
			}
		}
		
		// displaying the output
		System.out.println("           ----------------------------SAlES TABLE----------------------------");
		System.out.println("           Person 1        Person 2        Person 3        Person 4       TOTAL");
		System.out.println();
		
		for(int i = 0 ; i < 6 ; i++) {
		
			if(i == 5) {
				System.out.print("TOTAL-->");
			}
			else {
				System.out.print("Product "+(i+1));	
			}
		
			for(int j = 0; j < 5; j++) {
				if(i ==  5 && j == 4) {
			
				}
				else {
					System.out.print("    "+sales_table[i][j]+"         ");
				}
			}
			System.out.println();
		}
	}
}
