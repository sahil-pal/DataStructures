package DataStructures.Stacks;

class StackArray {

	static final int MAX = 1000; 
	int top; 
	int array[] = new int[MAX];  //Maximum size of Stack 

	public StackArray() 
	{ 
		top = -1; 
	} 

	public boolean isEmpty(){ 
		if(top < 0) {
			return true;
		}
		else {
			return false;
		}
	} 
	
	public boolean isFull() {
		if(top >= (MAX - 1)) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean push(int x){ 
		if(isFull()){ 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			array[++top] = x; 
			return true; 
		} 	
	} 

	public int pop(){ 
		if (isEmpty()) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = array[top];
			top--;
			return x; 
		} 
	} 

	public int peek() 
	{ 
    if (isEmpty()) { 
        System.out.println("Stack Underflow"); 
        return 0; 
    } 
    else { 
        int x = array[top]; 
        return x; 
    } 
}
}

public class que_1 {
	public static void main(String[] args) {
	
		StackArray s1 = new StackArray();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1.peek());
		while(!s1.isEmpty()) {
			System.out.println(s1.pop());
		}
		
		s1.peek();

	}

}
