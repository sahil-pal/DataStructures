package DataStructures.queues;

class CircularQueueArray{ 
	  
	public int size;
	public int front;
	public int rear; 
	public int[] queue;
	  
	// Constructor 
	public CircularQueueArray(int size) 
	{ 
	    this.size = size; 
	    this.front = this.rear = -1; 
	    queue = new int[size];
	} 
	
	  
	// Method to insert a new element in the queue. 
	public void enQueue(int data) 
	{ 
	      
	    // Condition if queue is full. 
	    if((front == 0 && rear == size - 1) || 
	      (rear == (front - 1) % (size - 1))) 
	    { 
	        System.out.print("Queue is Full"); 
	    } 
	  
	    // condition for empty queue. 
	    else if(front == -1) 
	    { 
	        front = 0; 
	        rear = 0; 
	        queue[rear] = data;
	    } 
	  
	    else if(rear == size - 1 && front != 0) 
	    { 
	        rear = 0; 
	        queue[rear] = data; 
	    } 
	  
	    else
	    { 
	        rear = (rear + 1); 
	        queue[rear] = data;  
	        
	      
	    } 
	} 
	  
	// Function to dequeue an element from the queue
	public int deQueue() 
	{ 
	    int temp; 
	  
	    // Condition for empty queue. 
	    if(front == -1) 
	    { 
	        System.out.print("Queue is Empty"); 
	          
	        // Return -1 in case of empty queue 
	        return -1;  
	    } 
	  
	    temp = queue[front]; 
	  
	    // Condition for only one element 
	    if(front == rear) 
	    { 
	        front = -1; 
	        rear = -1; 
	    } 
	    else if(front == size - 1) 
	    { 
	        front = 0; 
	    } 
	    else
	    { 
	        front = front + 1; 
	    } 
	      
	    // Returns the dequeued element 
	    return temp; 
	} 
	  
	// Method to display the elements of queue 
	public void displayQueue() 
	{ 
	      
	    // Condition for empty queue. 
	    if(front == -1) 
	    { 
	        System.out.print("Queue is Empty"); 
	        return; 
	    } 
	  
	    System.out.print("Elements in the circular queue are: "); 
	  
	    if(rear >= front) 
	    { 
	    
	        for(int i = front; i <= rear; i++) 
	        { 
	            System.out.print(queue[i]); 
	            System.out.print(" "); 
	        } 
	        System.out.println(); 
	    } 
	    else
	    { 
	         
	        for(int i = front; i < size; i++) 
	        { 
	            System.out.print(queue[i]); 
	            System.out.print(" "); 
	        } 
	        for(int i = 0; i <= rear; i++) 
	        { 
	            System.out.print(queue[i]); 
	            System.out.print(" "); 
	        } 
	        System.out.println(); 
	    } 
	}
}
	
public class que_7 {
	public static void main(String args[]) {
		
		CircularQueueArray q = new CircularQueueArray(10);
		
		q.enQueue(14); 
	    q.enQueue(22); 
	    q.enQueue(13); 
	    q.enQueue(-6); 
	      
	    q.displayQueue(); 
	  
	    int x = q.deQueue(); 
	  
	    // Checking for empty queue. 
	    if(x != -1) 
	    { 
	        System.out.print("Deleted value = "); 
	        System.out.println(x); 
	    } 
	  
	    x = q.deQueue(); 
	  
	    // Checking for empty queue. 
	    if(x != -1) 
	    { 
	        System.out.print("Deleted value = "); 
	        System.out.println(x); 
	    } 
	  
	    q.displayQueue(); 
	      
	    q.enQueue(9); 
	    q.enQueue(20); 
	    q.enQueue(5); 
	      
	    q.displayQueue(); 
	      
	    q.enQueue(20); 
	    
	    q.displayQueue();
	}
}
