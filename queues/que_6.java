package DataStructures.queues;

import java.util.Stack;

class reverseQueue extends QueueArray{
	
	  reverseQueue(int c) {
		super(c);
		
	}

	public void reversequeue() 
	    { 
	        Stack<Integer> stack = new Stack<>(); 
	        while (!this.isEmpty()) { 
	            stack.add(this.queue[front]); 
	            this.queueDequeue();
	        } 
	        while (!stack.isEmpty()) { 
	            this.queueEnqueue(stack.peek()); 
	            stack.pop(); 
	        } 
	    }

}


public class que_6 {
	public static void main(String args[]) {
		
		reverseQueue q1 = new reverseQueue(6);
		q1.queueEnqueue(1);
		q1.queueEnqueue(2);
		q1.queueEnqueue(3);
		q1.queueEnqueue(4);
		q1.queueEnqueue(5);
		q1.queueEnqueue(6);
		q1.queueDisplay();
		q1.reversequeue();
		q1.queueDisplay();
	}
}
