package DataStructures.Stacks;

class Stack_withoutOdds extends StackArray{
	
	public void removeOdds() {
		
		StackArray temp = new StackArray();
		if (isEmpty()) { 
			System.out.println("Stack Underflow condition.");  
		} 
		else { 
			int x = array[top];
			if(x%2 == 0) {
				temp.push(x);
				top--;
			}
			else {
			top--;
			}
		
		}
		
		while(!temp.isEmpty()) {
			System.out.println(temp.pop());
		}
	}
}


public class que_6 {
	public static void main(String[] args) {
		
		Stack_withoutOdds s1 = new Stack_withoutOdds();
		
		s1.push(16);
		s1.push(15);
		s1.push(19);
		s1.push(24);
		s1.push(14);
		
		s1.removeOdds();
	}

}
