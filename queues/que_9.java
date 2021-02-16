package DataStructures.queues;


class CircularQueue_frequency extends CircularQueueArray{

	public CircularQueue_frequency(int size) {
		super(size);
	}
	
	public void findFrequency() {
		
		
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
	            System.out.println("Frequency of element at "+i+" is "+frequency);
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
	            System.out.println("Frequency of element at "+i+" is "+frequency);
	        }  
	        for(int i = 0; i <= rear; i++) 
	        { 
	        	int frequency = 0;
	            for(int j = 0; j <= rear; j++) {
	            	if(queue[i] == queue[j]) {
	            		frequency++;
	            	}
	            }
	            System.out.println("Frequency of element at "+i+" is "+frequency);
	        } 
        }

}
}

public class que_9 {
	public static void main(String args[]) {
		
		CircularQueue_frequency q = new CircularQueue_frequency(10);
		
		q.enQueue(14); 
	    q.enQueue(22);
	    q.deQueue();
	    q.deQueue();
	    q.enQueue(13); 
	    q.enQueue(-6); 
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
	    q.findFrequency();
	   
	    
	}
}
