package Leetcode;

public class p1 {

	public static void main(String[] args) {
		
		int[] arr1= {-4,-2,0,3};
		int[] arr2= {2,4};
		int k=6;
		
	}
	public static long two_Sorted_Arrays(int[] arr1, int[] arr2, int k) {
		long lo=-1000_000_0000l;
		long hi=1000_000_0000l;
		long ans=0;
		while(lo<=hi) {
			long mid=lo+(hi-lo)/2;
			if(countProduct(arr1,arr2,mid)>=k) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		
	}
	public static long countProduct(int[] arr1, int[] arr2, long Dot_Prod) {
		for(int )
		
	}


}


