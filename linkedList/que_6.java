package DataStructures.linkedList;

import java.util.*;

public class que_6{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		SinglyLL l1 = new SinglyLL();
		
		System.out.println("Enter the decimal number to be converted and inserted : ");
		int decimal = sc.nextInt();
		
		int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       l1.insertionEnd(binary[i]);  
	     }     
	    
		System.out.print("-->");
		l1.display();
		
	}
}
