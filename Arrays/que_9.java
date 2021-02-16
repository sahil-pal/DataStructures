package DataStructures.Arrays;

import java.util.*;

class Pair { 
    int x; 
    int y; 
  
    
    public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 


public class que_9{
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number of pairs to be added : ");
	int n = sc.nextInt();
	
	Pair arr[] = new Pair[n]; 
	  
	for(int i = 0 ; i < n; i++) {
		int element1 = sc.nextInt();
		int element2 = sc.nextInt();
		arr[i] = new Pair(element1, element2);
   
	}
	
	Sort_print(arr,n);
	}


	static void Sort_print(Pair[] array, int n) {
		for(int i = 0; i < n; i++) {
    		if(array[i].x < array[i].y) {
    			
    		}
    		else {
    			int temp = array[i].x;
    			array[i].x = array[i].y;
    			array[i].y = temp;
    		}
    	}
    	
		System.out.println();
    	for(int i = 0; i < n; i++) {
    		System.out.print("("+array[i].x+","+array[i].y+") ");
    	}
    
	}
}

