package DataStructures.Stacks;

import java.util.*;

public class que_3 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		// using Stack created using linked list in que 2
		StackLL<String> s1 = new StackLL<String>();
		
		System.out.println("Enter the sentence : ");
		String sentence = sc.nextLine();
		System.out.println("Sentence berfore reverse : "+sentence);
		sentence = sentence+" ";
		
		String temp = "";
		for(int i = 0; i < sentence.length(); i++)
		  {
		    if(sentence.charAt(i) == ' ')
		    {
		      s1.push(temp); 
		      temp = "";          
		    }
		    else
		    {
		      temp = temp + sentence.charAt(i);
		    }
		 }
		
	
		System.out.println("Sentence after reverse : ");
		while(!s1.isEmpty()) {
			System.out.print(s1.pop()+" ");
		}
		
		
	}
}
