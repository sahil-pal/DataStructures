package DataStructures.queues;

class QNode { 
    int data; 
    QNode next; 
  
    public QNode(int data) 
    { 
        this.data = data; 
        this.next = null; 
    } 
} 
  
class QueueLL { 
    
	QNode front;
    QNode rear; 
  
    public QueueLL() 
    { 
        this.front = null;
        this.rear = null;
    } 
  
    
    public void enqueue(int key) 
    { 
        QNode temp = new QNode(key); 
  
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
             
        } 
  
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp; 
    } 
  
    
    public void dequeue() 
    { 
        // If queue is empty, return NULL. 
        if (this.front == null) {
        	System.out.println("Queue is empty, Nothing to deQueue");
        }
        else {
  
        // Store previous front and move front one node ahead 
        QNode temp = this.front; 
        this.front = this.front.next; 
  
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
            this.rear = null;
        }
    } 
    
    public void displayQueue() {
    	if(this.front == null) {
    		System.out.println("Queue is empty, Nothing to Display");
    	}
    	else {
    		QNode temp = this.front;
    		while(temp !=rear) {
    			System.out.print(temp.data+" <-- ");
    			temp = temp.next;
    		}
    		System.out.print(temp.data);
    	}
    }
} 

public class que_2 {
	public static void main(String[] args) 
    { 
        QueueLL q = new QueueLL(); 
        q.enqueue(10); 
        q.enqueue(20); 
        q.dequeue(); 
        q.dequeue(); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
        q.dequeue(); 
        q.displayQueue();
        System.out.println();
        System.out.println("Queue Front : " + q.front.data); 
        System.out.println("Queue Rear : " + q.rear.data); 
    } 
}
