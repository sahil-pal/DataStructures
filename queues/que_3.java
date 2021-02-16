package DataStructures.queues;

class Queue_counteven extends QueueArray{

	Queue_counteven(int c) {
		super(c);
	}
	
	public int countEven() {
		
		int count = 0; 
        if (this.front == this.rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            
        } 
        // traverse front to rear  
        for (int i = front; i < rear; i++) { 
            if(queue[i] % 2 == 0) {
            	count++;
            }
            else {
            	
            }
            
        } 
		return count;
	}
	
	
}

public class que_3 {
	public static void main(String args[]) {
		
		Queue_counteven q1 = new Queue_counteven(5);
		q1.queueEnqueue(1);
		q1.queueEnqueue(4);
		q1.queueEnqueue(5);
		q1.queueEnqueue(6);
		q1.queueEnqueue(2);
		
		System.out.println("Number of even elements in queue are : "+q1.countEven());
	}
}
