package lec9;
import java.util.*;
public class arrays1 {
	public static void main(String[] arg) {
		int [] arr=new int [5];
//		System.out.println(arr);
//		int [] other=arr;
//		System.out.println(other);
//		int [] arr1=new int [5];		//Java type declaration of array
//		int a []=new int [5];			//C type declaration of array
		Scanner sc=new Scanner(System.in);			//Both works in java
		int n=sc.nextInt();
		int i=0; 
		while(i<n) {
			arr[i]=sc.nextInt();
			i++;
		}
		Display(arr);
	}
	public static void Display(int[] arr) {
		int i=0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
	}
}
