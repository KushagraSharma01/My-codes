package lec14;
import java.util.*;
public class twodarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][]a=new int[3][4];			//collection of 1D arrays, total number of 1d arrays is n+1 where n is number of rows
		for(int i=0;i<a.length;i++) {		// that one extra array is for storing addresses of these arrays
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(a[1]);			//prints the address of 1D array (4k) of row of index 1
		System.out.println(a);				//prints the address of 2D array (11k)
		System.out.println(a[1][2]);		//prints the value at position 3 and 4
		int[][] other =a;					// No new 1D array is formed(address of previous array is stored in 'other').
		int row =a.length;					//gives number of rows in 2D array
		int column=a[0].length;				//gives the number of columns of 0th 1D array
		System.out.println(row);			
		System.out.println(column);	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
