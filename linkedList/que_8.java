package DataStructures.linkedList;

class DoublyLL{
	
	DoublyNode head;
	
	boolean isEmpty(){
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void insertionFront(int data) {
		DoublyNode newNode = new DoublyNode(data);
		
		if(isEmpty()) {
			head = newNode;
		}
		else {
			DoublyNode temp = head;
			newNode.next = temp;
			temp.prev = newNode;
			head = newNode;
		}
	}
	
	void insertionEnd(int data) {
		DoublyNode newNode = new DoublyNode(data);
		if(isEmpty()) {
			head = newNode;
		}
		else {
		DoublyNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
		}
	}
	
	void insertionPos(int data,int pos) {
		DoublyNode newNode = new DoublyNode(data);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			DoublyNode temp1 = head;
			DoublyNode temp2 = head.next;
			for(int i = 1; i < pos-1; i++) {
				temp1 = temp1.next;
				temp2 = temp2.next;
		}
				newNode.next = temp2;
				newNode.prev = temp1;
				temp2.prev = newNode;
				temp1.next = newNode;
		}
	}
	
	void removeFront() {
		
		if(isEmpty()) {
			System.out.println("Nothing to remove, the list is empty.");
		}
		else {
			DoublyNode temp = head;
			head = temp.next;
			temp.next = null;
			temp.prev = null;
		}
	}
	
	void removeEnd() {
		if(isEmpty()) {
			System.out.println("Nothing to remove, the list is empty.");
		}
		else {
			DoublyNode temp1 = head.next;
			DoublyNode temp2 = head;
			while(temp1.next != null) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			temp2.next = null;
			temp1.prev = null;
		}
	}
	
	void removePos(int pos) {
		DoublyNode temp1 = head;
		DoublyNode temp2 = head.next;
		for(int i = 1; i < pos-1; i++) {
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		temp1.next = temp2.next;
		temp2 = temp2.next;
		temp2.prev = temp1;
	}
	
	void display() {
		DoublyNode temp = head;
		System.out.println();
		while(temp.next!= null) {
			System.out.print(temp.item+" --> ");
			temp = temp.next;
		}
		System.out.print(temp.item);
	}
}


public class que_8 {
	public static void main(String[] args) {
	
		DoublyLL l1 = new DoublyLL();
		l1.insertionFront(1);
		l1.insertionEnd(2);
		l1.insertionEnd(3);
		l1.display();
		l1.removeFront();
		l1.removeFront();
		l1.display();
		

	}

}
