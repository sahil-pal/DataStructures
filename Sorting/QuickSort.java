package DataStructures.Sorting;
import java.util.*;


public class QuickSort
{
	void quickSort(int arr[], int low, int high)
	{
		if(low<high)
		{
			//partition the array around pi=>partitioning index and return pi
			int pi = Partition(arr,low,high);
			// sort each partition recursively 
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}

//selects last element as pivot, pi using which array is partitioned. 
	int Partition(int arr[],int low,int high)
	{
		int pi=arr[high];
		int i=low-1; // smaller element index  
		for(int j=low;j<high;j++)
		{
			// check if current element is less than or equal to pi
			if(arr[j]<pi)
			{
				i++;
				// swap arr[i] and arr[j] 
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		// swap arr[i+1] and arr[high] (or pi) 
		int temp1=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp1;
		return i+1;
	}

	static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String args[])
	{
		int arr[]={10,7,9,8,1,5};
		int n=arr.length;
		QuickSort ob = new QuickSort();
		ob.quickSort(arr,0,n-1);
		System.out.println("Sorted array:");
		ob.printArray(arr); 
	}

}
