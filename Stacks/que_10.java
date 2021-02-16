package DataStructures.Stacks;

import java.util.*;

class maxSumStacks {

	public int max_sum(int[] stack1, int[] stack2, int[] stack3){

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i =0; i < stack1.length;i++){
			sum1 += stack1[i];
		}
		for(int i =0; i < stack2.length;i++){
			sum2 += stack2[i];
		}
		for(int i =0; i < stack3.length;i++){
			sum3 += stack3[i];
		}

		int top1 = 0;
		int top2 = 0;
		int top3 = 0;

		while(true){
			if(sum1 == sum2 && sum2 == sum3){
				System.out.println("");
				return sum1;
				
			}

			if(top1 == stack1.length || top2 == stack2.length || top3 == stack3.length){
				return sum1;
			}

			if(sum1 > sum2 && sum1 > sum3){
				sum1 -= stack1[top1++];

			}
			else if(sum2 > sum1 && sum2 > sum3){
				sum2 -= stack2[top2++];

			}
			else if(sum3 > sum1 && sum3 > sum2){
				sum3 -= stack3[top3++];

			}
	
		}
	}
}
	
	
public class que_10 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter the number of elements in STACK 1 :");
		int n1 = sc.nextInt();
		int[] stack1 = new int[n1];
		System.out.println("Start entering the elements of STACK 1 : ");
		for(int i = 0; i < n1; i++){
			stack1[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Enter the number of elements in STACK 2 :");
		int n2 = sc.nextInt();
		int[] stack2 = new int[n2];
		System.out.println("Start entering the elements of STACK 2 : ");
		for(int i = 0; i < n2; i++){
			stack1[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Enter the number of elements in STACK 3 :");
		int n3 = sc.nextInt();
		int[] stack3 = new int[n3];
		System.out.println("Start entering the elements of STACK 3 : ");
		for(int i = 0; i < n3; i++){
			stack1[i] = sc.nextInt();
		}

		// calling the method
		maxSumStacks m1 = new maxSumStacks();
		System.out.println(m1.max_sum(stack1,stack2,stack3));
	}
}
