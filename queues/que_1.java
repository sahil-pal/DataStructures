package DataStructures.queues;

class QueueArray { 
    
	public int front;
	public int rear;
	public int capacity; 
    public int queue[]; 
  
    QueueArray(int c) 
    { 
        front = rear = 0; 
        capacity = c; 
        queue = new int[capacity]; 
    } 
  
   
    public void queueEnqueue(int data) 
    { 
        // check queue is full or not 
        if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            
        } 
  
        // insert element at the rear 
        else { 
            queue[rear] = data; 
            rear++; 
        } 
         
    } 
  
    // function to delete an element 
    // from the front of the queue 
    public int queueDequeue() 
    { 
    	int temp = 0;
        if (front == rear) { 
            System.out.println("--> Queue is empty"); 
            return 0; 
        } 
        else { 
            
        	for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
        	temp = queue[front];
            if (rear < capacity) {
            	queue[rear] = 0; 
                rear--; 
            }
            return temp;
        } 
        
    } 
  
    // print queue elements 
    public void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            
        } 
  
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.print(queue[i]+" <-- "); 
        } 
        System.out.println();
       
    } 
    
    public boolean isEmpty() {
    	if (front == rear) { 
            return true;
            
        } 
    	else {
    		return false;
    	}
    }
  
    // print front of queue 
    public void queueFront() 
    { 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
        return; 
    } 
    
    public QueueArray reverseQueue(QueueArray temp) {
    	QueueArray reversed = new QueueArray(temp.capacity);
    	for(int i = temp.capacity-1 ; i >= 0 ; i--) {
    		reversed.queueEnqueue(temp.queue[i]);
    	}
    	return reversed;
    }
} 


public class que_1 {
	 public static void main(String[] args) 
	    { 
	        // Create a queue of capacity 4 
	        QueueArray q = new QueueArray(4); 
	  
	        // print Queue elements 
	        q.queueDisplay(); 
	  
	        // inserting elements in the queue 
	        q.queueEnqueue(20); 
	        q.queueEnqueue(30); 
	        q.queueEnqueue(40); 
	        q.queueEnqueue(50); 
	  
	        // print Queue elements 
	        q.queueDisplay(); 
	  
	        // insert element in the queue 
	        q.queueEnqueue(60); 
	  
	        // print Queue elements 
	        q.queueDisplay(); 
	  
	        q.queueDequeue(); 
	        q.queueDequeue(); 
	        System.out.printf("\n\nafter two node deletion\n\n"); 
	  
	        // print Queue elements 
	        q.queueDisplay(); 
	  
	        // print front of the queue 
	        q.queueFront(); 
	    } 
}
