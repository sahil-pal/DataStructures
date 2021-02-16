package DataStructures.Stacks;

import java.util.*;

class reverseWord{

	public void reverseWords(String str) 
	{ 
	    StackLL<Character> st=new StackLL<Character>(); 
	   
	    // Traverse given string and push all 
	    // characters to stack until we see a space. 
	    for (int i = 0; i < str.length(); ++i) { 
	        if (str.charAt(i) != ' ') 
	            st.push(str.charAt(i)); 
	   
	        // When we see a space, we print 
	        // contents of stack. 
	        else { 
	            while (!st.isEmpty()) { 
	                System.out.print(st.pop()); 
	                  
	            } 
	            System.out.print(" "); 
	        } 
	    } 
	   
	    // Since there may not be space after 
	    // last word. 
	    while (st.isEmpty() == false) { 
	        System.out.print(st.pop()); 
	          
	    } 
	}
}	
	
		
public class que_8 {
	public static void main(String args[]) {
		
		String input = "hello world";
		reverseWord r1 = new reverseWord();
		r1.reverseWords(input);
	}
}
