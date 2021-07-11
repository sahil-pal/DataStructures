package Sorting;

import java.util.*;

public class BucketSort {
	
	public static void bucketSort(int[] inputArray) {
		
		List<Integer>[] buckets = new List[10];
		for(int i = 0; i < buckets.length; i++) {
			// using Arraylist as the bucket
			//buckets[i] = new ArrayList<Integer>();
			
			// using Linkedlist as the bucket
			buckets[i] = new LinkedList<Integer>();
		}
		
		// scattering phase
		for(int i = 0; i < inputArray.length; i++) {
			int value = inputArray[i];
			int hashedkey = Hashkey(value);
			System.out.println("Adding "+value+" --> @ "+hashedkey);
			buckets[hashedkey].add(value);
		}
		
		// sorting the buckets
		for(List bucket : buckets) {
			Collections.sort(bucket);
		}
		
		// Merging the buckets
		int j = 0;
		for(int i = 0 ; i < buckets.length; i++) {
			for(int value : buckets[i]) {
				inputArray[j++] = value;
			}
		}
	}
	
	private static int Hashkey(int key) {
		int width = Integer.toString(key).length();
		key = key/(int) Math.pow(10,width-1) % 10;
		return key;
		
	}

	public static void main(String args[]) {
		
		int[] array = {34,21,54,76,2,-21,43,93,-50};
		
		bucketSort(array);
		
		System.out.println();
		for(int i =0; i< array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
}
