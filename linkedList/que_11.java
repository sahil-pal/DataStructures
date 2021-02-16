package DataStructures.linkedList;

import java.util.*;

class AlternateSortLL extends SinglyLL{ 
    
	 public void sortList() {  
	          
		 Node current = head;
		 Node index = null;  
	     int temp;  
	          
	     if(isEmpty()) {  
	            return;  
	      }  
	      else {
	    	  while(current != null) {  
	            index = current.next;  
	            while(index != null) {  
	            	if(current.item > index.item) { 
	            		temp = current.item;  
	                    current.item = index.item;  
	                    index.item = temp;  
	                 }  
	                 index = index.next;  
	             }  
	                current = current.next;  
	           }      
	      }  
	 }
	 
	 public int getLast() {
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
		}
		return temp.item;
	 }
	 
	 public void alternateSort(AlternateSortLL ll,int n)  
    { 
          
        for (int i = 1; i < (n + 1)/2; i++) 
        { 
            int x = ll.getLast(); 
            ll.removeEnd(); 
            ll.insertionPos(x,2*i - 1);
        } 
          
        System.out.println(ll); 
    }
}
    
    
public class que_11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AlternateSortLL l1 = new AlternateSortLL();
		
		System.out.println("Enter the number of elements to be inserted : ");
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			l1.insertionEnd(sc.nextInt());
		}
		
		l1.display();
		l1.sortList();
		l1.display();
		l1.alternateSort(l1, n);
	}

}
