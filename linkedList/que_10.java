package DataStructures.linkedList;

class DoublyCircular extends DoublyLL{
	
	DoublyNode head;
	DoublyNode tail;
	
	boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insertionPos(int item, int pos) {
		DoublyNode newNode = new DoublyNode(item);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			newNode.next = tail;
		}
		else {
			DoublyNode temp1 = head;
			if(temp1.next!=null) {
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
			else {
				temp1.next = newNode;
				newNode.next = tail;
				tail = newNode;
				newNode.prev = temp1;
			}
				
		}
	}
	
	public void removePos(int pos) {
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
	
	public void display() {
		DoublyNode temp = head;
		System.out.println();
		while(temp.next!=head) {
			System.out.print(temp.item+"-->");
			temp = temp.next;
		}
		System.out.println(temp.item);
	}
	
}


public class que_10 {
	public static void main(String args[]) {
		
		DoublyCircular l1 = new DoublyCircular();
		l1.insertionPos(1, 0);
		l1.insertionPos(2, 1);
		l1.insertionPos(3, 2);
		l1.insertionPos(4, 3);
		l1.insertionPos(5, 4);
		l1.display();
		l1.removePos(2);
		l1.removePos(3);
		l1.display();
	}
}
