package DataStructures.Stacks;


class Node<T>{
	T item;
	Node next;
	
	Node(T data){
		item = data;
		next = null;
	}
}

class StackLL<T> {
	
	private Node<T> top;
	
	 public StackLL(){
		top = null;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		if(isEmpty()) {
			top = newNode;
		}
		else{
			newNode.next = top;
			top = newNode;
		}
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("The stack is underflow.");
			return null;
		}
		else {
			Node temp = top;
			top = temp.next;
			temp.next = null;
			return (T) temp.item;
		}
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("The stack is underflow.");
			return null;
		}
		else {
			Node<T> temp = top;
			return temp.item;
		}
	}
	
}

public class que_2 {
	public static void main(String args[]) {
		
		StackLL<Integer> s1 = new StackLL<Integer>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1.peek());
		while(!s1.isEmpty()) {
			System.out.println(s1.pop());
		}
		
		s1.peek();
	}
}
