package DataStructures.Sorting;
import java.util.Arrays;



public class InsertionSort
{
	void insertionSort(int arr[])
	{
		int size=arr.length;
		for(int step=1;step<size;step++)
		{
			int key=arr[step];
			int j=step-1;
			// Compare key with each element on the left of it until an element smaller than
			//it is found
			//For descending order, change key<arr[j] to key>arr[j]
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			//Place key at after the element just smaller than it
			arr[j+1]=key;
		}
	}

	public static void main(String args[])
	{
		int arr[]={9,5,1,4,3};
		InsertionSort ob=new InsertionSort();
		ob.insertionSort(arr);
		System.out.println("Sorted Array in Ascending Order:");
		System.out.println(Arrays.toString(arr));
	}
}
