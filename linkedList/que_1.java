package DataStructures.linkedList;

import java.util.*;

class SinglyLL{

public Node head;
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insertionFront(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
	
		}
	}
	
	public void insertionEnd(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			newNode.next = null;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
			temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = null;
		}
	}
	
	public void insertionPos(int data,int pos) {
		Node newNode = new Node(data);
		Node temp1 = head.next;
		Node temp2 = head;
		for(int i = 1; i < pos-1; i++) {
			temp2 = temp2.next;
			temp1 = temp1.next;
		}
		newNode.next = temp1;
		temp2.next = newNode;
	}
	
	public void display() {
		System.out.println("Elements are : ");
		Node temp = head;
		while(temp.next != null) {
			System.out.println(temp.item);
			temp = temp.next;
		}
		System.out.println(temp.item);
	}
	
	void removeFront() {
		if(isEmpty()) {
			System.out.println("Noting to remove , the list is empty.");
		}
		else {
			Node temp = head;
			head = temp.next;
			temp.next = null;
		}
	}
	
	void removeEnd() {
		if(isEmpty()) {
			System.out.println("Noting to remove , the list is empty.");
		}
		else {
			Node temp1 = head;
			Node temp2 = head.next;
			while(temp2.next != null) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			temp1.next = null;
		}
	}
	
	public void removePos(int pos) {
		Node temp1 = head;
		Node temp2 = head.next;
		for(int i =1; i < pos-1; i++) {
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		temp1.next = temp2.next;
		temp2.next = null;
	}
	
	boolean search(int data) {
		Node temp = head;
		boolean value = false;
		while(temp.next != null) {
			if(temp.item == data) {
				value = true;
				temp = temp.next;
			}
			else {
				temp = temp.next;
			}
		}
		return value;
		
	}
}

public class que_1{
	public static void main(String args[]) {
		
		SinglyLL s1 = new SinglyLL();
		s1.insertionFront(1);
		s1.insertionFront(2);
		s1.insertionEnd(3);
		s1.display();
		s1.removeEnd();
		s1.display();
		s1.removeFront();
		s1.display();
		
	}
}
