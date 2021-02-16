package DataStructures.queues;

import java.util.Scanner;

public class que_11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to add :  ");
		int n = sc.nextInt();
		
		QueueArray q1 = new QueueArray(n);
		QueueArray q2 = new QueueArray(n);
		
		int i = 1;
		System.out.println("Start entering the elements...");
		while(i <= n) {
			int data = sc.nextInt();
			q1.queueEnqueue(data);
			i++;
		}
		
		int flag = 0;
		
		System.out.println("Original Queue...");
		q1.queueDisplay();
		System.out.println();
		
		// reversed Queue method call
		q2 = q1.reverseQueue(q1);
		System.out.println("Reversed Queue...");
		q2.queueDisplay();
		System.out.println();
		
		int j = 0;
		while(j < n) {
			if(q1.queueDequeue() == q2.queueDequeue()) {
				
			}
			else {
				flag = 1;
			}
			
			j++;
		}
		
		if(flag == 0) {
			System.out.println("The Queue is a Palindrome.");
		}
		else {
			System.out.println("The Queue is not a Palindrome.");
		}
		
		
	}
}
