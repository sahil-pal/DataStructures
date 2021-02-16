package DataStructures.Stacks;

import java.util.*;

class infix_to_postfix{ 
   
    public int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
       
    public String infixToPostfix(String exp) 
    { 
        
        String result = new String(""); 
          
        StackLL<Character> stack = new StackLL<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
         
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            else if (c == '(') 
                stack.push(c); 
      
            else if (c == ')') 
            { 
                while (!stack.isEmpty() &&  
                        stack.peek() != '(') 
                    result += stack.pop(); 
                  
                    stack.pop(); 
            } 
            else 
            { 
                while (!stack.isEmpty() && Prec(c)  
                         <= Prec(stack.peek())){ 
                    
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
    } 
}
    
public class que_7 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the expression to be converted : ");
		String exp = sc.next();
		
		infix_to_postfix convertor = new infix_to_postfix();
		
        System.out.println(convertor.infixToPostfix(exp)); 
	}
}
