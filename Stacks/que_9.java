package DataStructures.Stacks;

import java.util.*;

class prefix_to_postfix {
	 
    // function to check if character
    // is operator or not
    static boolean isOperator(char x)
    {
        switch (x) {
        case '+':
        case '-':
        case '/':
        case '*':
            return true;
        }
        return false;
    }
 
    // Convert prefix to Postfix expression
    static String preToPost(String pre_exp)
    {
 
        Stack<String> s = new Stack<String>();
 
        // length of expression
        int length = pre_exp.length();
 
        // reading from right to left
        for (int i = length - 1; i >= 0; i--) 
        {
            // check if symbol is operator
            if (isOperator(pre_exp.charAt(i))) 
            {
                // pop two operands from stack
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
 
                // concat the operands and operator
                String temp = op1 + op2 + pre_exp.charAt(i);
 
                // Push String temp back to stack
                s.push(temp);
            }
 
            // if symbol is an operand
            else {
                // push the operand to the stack
                s.push(pre_exp.charAt(i) + "");
            }
        }
 
        // stack contains only the Postfix expression
        return s.peek();
    }
}

public class que_9 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the expression to be converted : ");
		
		String pre_exp = sc.next();
		prefix_to_postfix convertor = new prefix_to_postfix();
	    System.out.println(convertor.preToPost(pre_exp));
	}
}
