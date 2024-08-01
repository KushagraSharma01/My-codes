package problems;

import java.util.Arrays;

public class maximum_subarraySum {
	public static void main(String[] arg) {
		int[] a= {2,-3,-1,5,7,-3};
		 
		System.out.println(Maximum_subarraysum(a));
	}
	
	public static int Maximum_subarraysum(int[]a) {				//Kadane's Algorithm
		int ans=a[0];
			int sum=0;
			for(int j=0;j<a.length;j++) {
				sum+=a[j];
				ans=Math.max(sum,ans);
				if(sum<0) {
					sum=0;
				}
			}
		
		return ans;
	}
}
