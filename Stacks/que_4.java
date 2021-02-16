package DataStructures.Stacks;

import java.util.*;

public class que_4 {
	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
		
		StackLL<Character> s1 = new StackLL<Character>();
		
		System.out.println("Enter the expression : ");
		
		while(sc.hasNext()) {
			
			String input = sc.next();
			
			boolean isBalanced = true;
			for(int i = 0; i < input.length() ; i++) {
				char c = input.charAt(i);
				
				if(c == '{' || c == '(' || c == '[' ) {
					 s1.push(c);
				}
				
				if(c == '}') {
					
					if(s1.peek() == '{') {
						s1.pop();
					}
					else {
						isBalanced = false;
						break;
					}
				}
				if(c == ')') {
					
					if(s1.peek() == '(') {
						s1.pop();
					}
					else {
						isBalanced = false;
						break;
					}
				}
				if(c == ']') {
					
					if(s1.peek() == '[') {
						s1.pop();
					}
					else {
						isBalanced = false;
						break;
					}
				}
			}
			if(!s1.isEmpty()) {
				isBalanced = false;
			}
			if(isBalanced == true) {
				System.out.println("expression is balanced.");
			}
			if(isBalanced == false){
				System.out.println("expression is not balanced.");
			}
    	}
	}

}
