package DataStructures.Arrays;

import java.util.*;

public class que_7 {
	public static void swapPairs(int[] a){
	    int len=a.length;
	        if(len%2 ==0){
	            for(int i=0; i<len; i=i+2){
	                int temp = a[i];
	            	a[i]= a[i+1];
	                a[i+1]= temp;
	                
	            }   
	        }
	        else{
	            for(int j=0; j<len-1; j=j+2){
	            	int temp = a[j];
	            	a[j]= a[j+1];
	                a[j+1]= temp;
	            }
	        }
	}

	public static void printArray(int[] a){
	    for(int i = 0; i < a.length ;i ++) {
	    	System.out.println(a[i]);
	    }
	}

	    public static void main(String args[]){

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the number of elements to be inserted : ");
	    int n = sc.nextInt();

	    int[] array = new int[n];

	    System.out.println("Start Entering the elements");

	    for(int i = 0 ; i < n; i++){
	        array[i] = sc.nextInt();
	    }

	    swapPairs(array);
	    printArray(array);
	    }
}
