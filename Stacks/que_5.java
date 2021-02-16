package DataStructures.Stacks;

import java.util.*;

class Tower_of_Hanoi {

	static int minimum_steps = 0;
	static int towerOfHanoi(int n,char from, char to, char aux) {
		
		if(n == 1) {
			System.out.println("-->Move top disk from "+from+" to rod "+to);
			minimum_steps++;
		}
		else {
			towerOfHanoi(n-1,from, aux, to);
			System.out.println("-->Move disk "+n+" from rod "+from+" to rod "+to);
			towerOfHanoi(n-1,aux,to,from);
			minimum_steps++;
			
		}
		
		return minimum_steps;

}
}

public class que_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of disk :");
		int n = sc.nextInt();
		
		Tower_of_Hanoi t1 = new Tower_of_Hanoi();
		
		System.out.println("mimimunm steps : " +t1.towerOfHanoi(n,'A','C','B'));

	}

}
