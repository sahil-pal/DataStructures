package DataStructures.linkedList;

import java.util.Scanner;

public class que_12{
	
	static int elimination(int n, int k){
		if(n==1){
			return 1;
		}
		else{
			// recursion
			return (elimination(n-1,k) + k-1)%n+1;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of children : ");
		int n = sc.nextInt();
		System.out.println("Enter the length of count out : ");
		int k = sc.nextInt();
		
		// calling the elimination function
		System.out.println("Winner of the program after all other's elimination : ");
		System.out.println("child number :"+elimination(n,k));
		
	}
}