package DataStructures.queues;

class CircularQueue_findUnique extends CircularQueueArray{

	public CircularQueue_findUnique(int size) {
		super(size);
	}
	
	public void findUnique() {
		
		
		if(front == -1) 
	    { 
	        System.out.print("Queue is Empty, Frequency = 0"); 
	         
	    } 
	  
	    if(rear >= front) 
	    { 
	    
	        for(int i = front; i <= rear; i++) 
	        { 
	            int frequency = 0;
	            for(int j = front; j <= rear; j++) {
	            	if(queue[i] == queue[j]) {
	            		frequency++;
	            	}
	            }
	            if(frequency == 1) {
	            	System.out.println("Unique element in the queue : "+queue[i]);
	            }
	            
	        } 
	        
	    } 
	    else
	    { 
	         for(int i = front; i < size; i++) 
	        { 
	        	int frequency = 0;
	            for(int j = front; j < size; j++) {
	            	if(queue[i] == queue[j]) {
	            		frequency++;
	            	}
	            }
	            if(frequency == 1) {
	            	System.out.println("Unique element in the queue : "+queue[i]);
	            }
	        }  
	        for(int i = 0; i <= rear; i++) 
	        { 
	        	int frequency = 0;
	            for(int j = 0; j <= rear; j++) {
	            	if(queue[i] == queue[j]) {
	            		frequency++;
	            	}
	            }
	            if(frequency == 1) {
	            	System.out.println("Unique element in the queue : "+queue[i]);
	            }
	        } 
        }

}
}

public class que_10 {
public static void main(String args[]) {
		
		CircularQueue_findUnique q = new CircularQueue_findUnique(10);
		
		q.enQueue(1); 
	    q.enQueue(2);
	    q.deQueue();
	    q.deQueue();
	    q.enQueue(1); 
	    q.enQueue(2); 
	    q.enQueue(14); 
	    q.enQueue(22); 
	    q.deQueue();
	    q.enQueue(14); 
	    q.enQueue(22); 
	    q.enQueue(13); 
	    q.enQueue(-6); 
	    q.enQueue(14); 
	    q.enQueue(22); 
	    q.displayQueue();
	    q.findUnique();
	   
	    
	}
	
}
