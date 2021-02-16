package DataStructures.linkedList;

class SinglyLL_functions extends SinglyLL {

	public void swapFirstLast() {
		
		 Node current = head;
		 Node temp = null;
		 Node index = null;  
         
	     if(isEmpty()) {  
	    	 System.out.println("Nothing to Swap");  
	     }  
	     else {  
	    	 while(current.next != null) {  
	         index = current;  
	         current = current.next;  
	         }  
	              
	              
	         if(head == current) {  
	              
	         }  
	         else if(head.next == current) {  
	        	 temp = head;  
	             head = current;  
	             head.next = temp;  
	             temp.next = null;  
	            }  
	         else {  
	        	 temp = head;  
	             head = current;  
	             head.next = temp.next;  
	             index.next = temp;  
	             temp.next = null;  
	            }  
	        }  
	}
	
	public void swapPairwise() {
		if(isEmpty()) {
			System.out.println("Nothing to swap");
		}
		else {
			Node temp = head; 
			while (temp != null && temp.next != null) { 
				int k = temp.item; 
	            temp.item = temp.next.item; 
	            temp.next.item = k; 
	            temp = temp.next.next; 
	        } 
			
		}
	}
	
	public void getLocFirstLast(int item) {
		int first = 0;
		int last = 0;
		if(isEmpty()) {
			System.out.println("Nothing to search");
		}
		else {
			Node temp = head;
			int count = 0;
			while(temp.next!= null) {
				if(temp.item == item) {
					if(first == 0) {
						first = last = count;
					}
					else {
						last = count;
					}
				}
				else {
					
				}
				count++;
				temp = temp.next;
			}
			if(first > 0) {
				System.out.println("First and last occurence of "+item+" is at index : "+first+" and "+last);
			}
			else {
				System.out.println("Searched element does not exist");
			}
		}
	}
	
	public void removeDuplicates() {
		if(isEmpty()) {
			System.out.println("Nothing to be removed, the linkedlist is empty.");
		}
		else {
			Node temp1 = null;
			Node temp2 = null;
			Node dup = null; 
	        temp1 = head; 
	  
	        while(temp1.next != null) { 
	            temp2 = temp1; 
	
	            while (temp2.next != null) { 
	            	if (temp1.item == temp2.next.item) { 
	                    dup = temp2.next; 
	                    temp2.next = temp2.next.next; 
	                     
	                } else /* This is tricky */ { 
	                    temp2 = temp2.next; 
	                } 
	            } 
	            temp1 = temp1.next; 
	        } 
		}
	}
	
	public void removeAlternate() {
		if(isEmpty()) {
			System.out.println("Nothing to be removed , the linkedlist is empty");
		}
		else {
			Node temp = head; 
			Node temp_next = head.next; 

			 while (temp != null && temp_next != null)  
			 {            
			     
			     temp.next = temp_next.next; 
			     temp_next = null; 
			     temp = temp.next; 
			     if (temp != null)  
			        temp_next = temp.next; 
			 } 
			
		}
	}
	
	
}


public class que_2{
	public static void main(String args[]) {
		
		SinglyLL_functions s1 = new SinglyLL_functions();
		s1.insertionFront(1);
		s1.insertionEnd(2);
		s1.insertionEnd(6);
		s1.insertionEnd(3);
		s1.insertionEnd(4);
		s1.insertionEnd(5);
		s1.insertionEnd(6);
		s1.insertionEnd(4);
		s1.insertionEnd(7);
		s1.insertionEnd(8);
		s1.display();
		
		
		s1.swapFirstLast();
		s1.display();
		s1.swapPairwise();
		s1.display();
		s1.getLocFirstLast(4);
		s1.display();
		s1.removeDuplicates();
		s1.display();
		s1.removeAlternate();
		s1.display();
		
		
	}
}
