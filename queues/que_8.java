package DataStructures.queues;

class CircularQueue_findDuplicates extends CircularQueueArray{

	public CircularQueue_findDuplicates(int size) {
		super(size);
	}
	
	public void findDuplicate() {
		int[] dupli_elements = new int[size];
		int index = -1;
		
		if(this.front == -1) {
			System.out.println("No duplicates found, the CircularQueue is empty");
		}
		else if(this.front == 0) {
			for(int i = front; i <= rear; i++) {
				for(int j = front+1; j <= rear; j++) {
					if(queue[i] == queue[j]) {
						index++;
						dupli_elements[index] = queue[i];
					}
				}
			}
		}
		else {
			for(int i = front; i < size; i++) 
	        {
				for(int j = front+1; j < size; j++) {
					if(queue[i] == queue[j]) {
						index++;
						dupli_elements[index] = queue[i];
					}
	        } 
	        }
	        for(int i = 0; i < front; i++) 
	        { 
	        	for(int j = i + 1; j < front; j++) {
					if(queue[i] == queue[j]) {
						index++;
						dupli_elements[index] = queue[i];
				}
	        } 
		}
		}
		
		if(index > -1) {
			System.out.println("Duplicate elements are ");
			for(int i =0; i < dupli_elements.length; i++) {
				System.out.print(dupli_elements[i]+" , ");
			}
		}
	
}
}


public class que_8 {
	public static void main(String args[]) {
		
		CircularQueue_findDuplicates q = new CircularQueue_findDuplicates(20);
		
		q.enQueue(14); 
	    q.enQueue(22); 
	    q.enQueue(13); 
	    q.enQueue(-6); 
	    q.enQueue(14); 
	    q.enQueue(22); 
	    q.enQueue(14); 
	    q.enQueue(22); 
	    q.displayQueue();
	    q.findDuplicate();
	    
	}
}
