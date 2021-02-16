package DataStructures.linkedList;

import java.util.*;

class SinglyLL_Palindrome extends SinglyLL{
	
	public boolean checkPalindrome() {
		Node temp = this.head;
		SinglyLL temp_LL = new SinglyLL();
		int flag = 0;
		
		while(temp.next!=null) {
			temp_LL.insertionFront(temp.item);
			temp = temp.next;
		}
			temp_LL.insertionFront(temp.item);
		
		Node temp1 = this.head;
		Node temp2 = temp_LL.head;
		
		while(temp1!=null) {
			if(temp1.item == temp2.item) {
				
			}
			else {
				flag = 1;
			}
			temp1 = temp1.next;
			temp2= temp2.next;
		}
		
		if(flag == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class que_4 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be added : ");
		int n = sc.nextInt();
		System.out.println("Start entering the elements...");
		
		SinglyLL_Palindrome l1 = new SinglyLL_Palindrome();
		
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			l1.insertionEnd(temp);
		}
		
		boolean result = l1.checkPalindrome();
		System.out.println("The given linked-list is Palindrome : "+result);
	}
}
