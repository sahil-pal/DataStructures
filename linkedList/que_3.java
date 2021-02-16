package DataStructures.linkedList;

import java.util.*;

class SinglyLL_findidentical extends SinglyLL {

	public boolean findidentical(SinglyLL_findidentical l1) {
		Node temp1 = this.head;
		Node temp2 = l1.head;
		int flag = 0;
		while(temp1.next != null) {
			if(temp1.item == temp2.item) {
				
			}
			else {
				flag = 1;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		if(flag == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

public class que_3{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be added in linked-list 1 : ");
		int n1 = sc.nextInt();
		SinglyLL_findidentical l1 = new SinglyLL_findidentical();
		System.out.println("Enter the number of elements to be added in linked-list 2 :");
		int n2 = sc.nextInt();
		SinglyLL_findidentical l2 = new SinglyLL_findidentical();
		
		if(n1 == n2) {
			System.out.println("Start entering linked list 1 elements...");
			for(int i = 0;i < n1; i++) {
				int temp = sc.nextInt();
				l1.insertionEnd(temp);
			}
		
			System.out.println("Start entering linked list 2 elements...");
			for(int i = 0;i < n2; i++) {
				int temp = sc.nextInt();
				l2.insertionEnd(temp);
			}
			
			boolean result = l1.findidentical(l2);
			System.out.println("Linked-list Identicals : "+result);
		}
		else {
			System.out.println("Linked lists cannot be identical, since size does not match.");
		}
		
		
	}
}