package DataStructures.queues;

import java.util.Stack;

//import DataStructures.Stacks.*;

class Queue_revElement extends QueueArray{

	Queue_revElement(int c) {
		super(c);
	}
	
	public void reverseQueueFirstKElements(int k, int size) 
    { 
        if (isEmpty() == true || k > size || k <= 0) {
        	
        }
        else {    
        
        Stack<Integer> stack = new Stack<Integer>(); 
  
        // Push the first K elements into a Stack 
        for (int i = 0; i < k; i++) { 
            stack.push(this.queue[front]); 
            this.queueDequeue();
        } 
  
        // Enqueue the contents of stack 
        // at the back of the queue 
        while (!stack.empty()) { 
           this.queueEnqueue(stack.peek()); 
            stack.pop(); 
        } 
  
        // Remove the remaining elements and enqueue 
        // them at the end of the Queue 
        for (int i = 0; i < size - k; i++) { 
            this.queueEnqueue(this.queue[front]); 
            this.queueDequeue();
        } 
        } 
    }
	
}
public class que_4 {
	public static void main(String args[]) {
		
		Queue_revElement q = new Queue_revElement(8);
		q.queueEnqueue(1);
		q.queueEnqueue(2);
		q.queueEnqueue(3);
		q.queueEnqueue(4);
		q.queueEnqueue(5);
		q.queueEnqueue(6);
		q.queueEnqueue(7);
		q.queueDisplay();
		
		q.reverseQueueFirstKElements(3,8);
		q.queueDisplay();
	}
}
