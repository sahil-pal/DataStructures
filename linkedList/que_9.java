package DataStructures.linkedList;

import java.util.Scanner;

class DoublyLL_rotate extends DoublyLL{
	
	
	public void rotate( int N)  
	{  
	    if (N == 0)  
	        return;  
	  
	    DoublyNode current = head;  
	    
	    int count = 1;  
	    while (count < N && current != null) 
	    {  
	        current = current.next;  
	        count++;  
	    }  
	    if (current == null)  {
	    }
	    
	    DoublyNode NthNode = current;  
	    while (current.next != null)  
	        current = current.next;   
	    	current.next = head;  
	   
	    (head).prev = current;  
	    head = NthNode.next;  
	    (head).prev = null;   
	    NthNode.next = null;  
	}  
}

public class que_9 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		DoublyLL_rotate l1 = new DoublyLL_rotate();
		
		System.out.println("Enter the index from where the linked-list to be rotated : ");
		int n = sc.nextInt();
		
		l1.insertionFront(7);
		l1.insertionFront(6);
		l1.insertionFront(5);
		l1.insertionFront(4);
		l1.insertionFront(3);
		l1.insertionFront(2);
		l1.insertionFront(1);
		l1.insertionFront(0);
		l1.display();
		l1.rotate(n);
		l1.display();
		
		
	}
}
