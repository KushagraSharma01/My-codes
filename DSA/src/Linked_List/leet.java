package Linked_List;

import java.util.Arrays;

public class leet {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
	    int arr[] = {1, 2, 3, 4, 5};
	    int r = 3;
	    int n = arr.length;
	    printCombination(arr, n, r);
		
	}
	static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];
 
        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
	static void combinationUtil(int arr[], int data[], int start,
            int end, int index, int r)
	{
		// Current combination is ready to be printed, print it
		if (index == r)
		{	
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}
		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			combinationUtil(arr, data, i+1, end, index+1, r);
		}
	}
}
