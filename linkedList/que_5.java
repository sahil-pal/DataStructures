package DataStructures.linkedList;

import java.util.*;

public class que_5 {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		SinglyLL_functions l1 = new SinglyLL_functions();
		
		System.out.println("Enter the number of elements to be added in linked-list");
		int n = sc.nextInt();
		System.out.println("Start entering the elements...");
		
		for(int i =0; i< n ; i++) {
			int temp = sc.nextInt();
			l1.insertionEnd(temp);
		}
		
		System.out.print("Before pair wise reverse  ");
		l1.display();
		
		System.out.print("After pair wise reverse  ");
		l1.swapPairwise();
		l1.display();
	}
}
