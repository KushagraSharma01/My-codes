package lec10;
import java.util.*;
public class Range_Reverse {
	public static void main(String[] arg) {
			// TODO Auto-generated method stub
			int [] a= {1,3,1,3,2,4,422,-99};
			int k=3;
			ReverseAlgo(a,k);
			int n=a.length;
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
	}
			public static void ReverseAlgo(int[] a,int k) {
				//last element
				int n=a.length;
				Reverse(a,0,n-k-1);
				Reverse(a,n-k,n-1);
				Reverse(a,0,n-1);
				
				//first element n-k
			}
			public static void Reverse(int []a,int i,int j) {
				while(i<=j) {
					int c=a[j];
					a[j]=a[i];
					a[i]=c;
					i++;				//Two pointer approach
					j--;
				}

			}}