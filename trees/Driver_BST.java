package DataStructures.trees;

import java.util.Scanner;

public class Driver_BST {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BST b = new BST();
		
		boolean terminate = false;
		
		while(terminate == false) {
		System.out.println("-------------ENTER CHOICES-------------");
		System.out.println("[1] --> INSERT");
		System.out.println("[2] --> DELETE");
		System.out.println("[3] --> SEARCH");
		System.out.println("[4] --> COUNT NODES");
		System.out.println("[5] --> ISEMPTY");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : 
		{
			System.out.println("How many elements to be inserted : ");
			int n = sc.nextInt();
			System.out.println("Start Entering ...");
			for(int i = 0; i < n ; i++) {
				b.insert(sc.nextInt());
			}
			break;
		}
		
		case 2 :
		{
			System.out.println("How many elemens to be deleted : ");
			int n = sc.nextInt();
			System.out.println("Starting Deletion...");
			for(int i = 0; i < n ; i++) {
				b.delete(i);
			}
			break;
		}
		
		case 3 :
		{
			System.out.println("Enter the element to be searched : ");
			int n = sc.nextInt();
			boolean result = b.search(n);
			System.out.println("Searched element found in the tree : "+result);
			break;
		}
		
		case 4 :
		{
			System.out.println("Enter the elemenet whose nodes are to be counted : ");
			int n = sc.nextInt();
			BSTNode temp = new BSTNode(n);
			System.out.println("Number of nodes for searched element is : "+b.CountBST(temp));
			break;
		}
		
		case 5 : 
		{
			System.out.println("Checking for empt condition...");
			System.out.println("The given tree is empty : "+b.isEmpty());
			break;
		}
		
		default : System.out.println("NOT A VALID CHOICE ");
		
		System.out.println("Do You want to continue [ Y/y--> YES ] or press any other key to exit. ");
		String cont = sc.next();
		
		if(cont.equals("Y") || cont.equals("y")) {
			
		}
		else {
			terminate = true;
		}
		}
		
		}
	}
}
