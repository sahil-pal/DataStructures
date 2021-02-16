package DataStructures.linkedList;

import java.util.*;

public class que_7{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		SinglyLL l1 = new SinglyLL();
		SinglyLL l2 = new SinglyLL();
		
		System.out.println("Enter the number of elements of linked-list 1 :");
		int n1 = sc.nextInt();
		System.out.println("Start entering the elements : ");
		
		for(int i =0; i < n1 ; i++) {
			l1.insertionEnd(sc.nextInt());
		}
		
		System.out.println("Enter the number of elements of linked-list 2 :");
		int n2 = sc.nextInt();
		System.out.println("Start entering the elements : ");
		
		for(int i =0; i < n2 ; i++) {
			l2.insertionEnd(sc.nextInt());
		}
		
		System.out.println();
		System.out.println("After the suffle merge... ");
		shuffleMerge(l1,l2);
	}

	private static void shuffleMerge(SinglyLL l1, SinglyLL l2) {
		Node temp1 = l1.head;
		Node temp2 = l2.head;
		int index = 2;
		while(temp1.next != null) {
			
			l1.insertionPos(temp2.item, index);
			l1.display();
			temp1 = temp1.next;
			if(temp1.next!=null) {
				temp1 = temp1.next;
			}
			temp2 = temp2.next;
			index = index + 2;
		}
		l1.insertionEnd(temp2.item);
		while(temp2.next!=null) {
			temp2 = temp2.next;
			l1.insertionEnd(temp2.item);
		}
		
		l1.display();
		
	
		
	}
}
