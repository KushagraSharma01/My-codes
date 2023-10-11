package questions;

import java.util.Arrays;

public class Longest_increasing_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr= {10,9,2,5,3,7,101,10};
			System.out.println(LIS(arr));
	}
	public static int LIS(int[] arr) {
		int []dp=new int[arr.length];
		Arrays.fill(dp, 1);
		for(int i=1;i<dp.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<arr[i]) {
					int a=dp[j]+1;
					dp[i]=Math.max(dp[i], a);
				}
			}
		}
		int max=-1;
		for(int i=0;i<dp.length;i++)
			max=Math.max(max,dp[i]);
		return max;
	}

}
