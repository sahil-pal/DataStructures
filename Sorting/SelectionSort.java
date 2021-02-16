package DataStructures.Sorting;

public class SelectionSort
{
	void selectionSort(int[] arr)
	{
		int temp,min_index;
		for(int i=0;i<arr.length-1;i++)
		{
			//for each i,we will find the smallest element till the end of arr
			min_index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min_index]>arr[j])
				{
					min_index=j;
				}
			}
			//after this loop we will find the index of min element
			//Swap the elements
			temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		// return arr;
	}

	void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {38,2,7,10,27,22};
		ob.selectionSort(arr);
		System.out.println("Sorted array:");
		ob.printArray(arr);
	}
}
