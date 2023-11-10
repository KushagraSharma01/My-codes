package questions;

import java.util.Arrays;

public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []wt= {1,2,3,2,2};
		int []val= {8,4,0,5,3};
		int cap=4;
		int [][]dp=new int[wt.length+1][val.length+1];
		for(int i=0;i<dp.length;i++)
			Arrays.fill(dp[i], -1);
		System.out.println(knapsack(dp,wt,val,cap,0));
	}
	public static int knapsack(int [][]dp,int []wt,int[]val,int cap,int i) {
		if(i==wt.length||cap==0)
			return 0;
		if(dp[cap][i]!=-1)
			return dp[cap][i];
		int inc=0,exc=0;
		if(cap>=wt[i]) {
			inc= val[i]+knapsack(dp,wt,val,cap-wt[i],i+1);
		}
		exc=knapsack(dp,wt,val,cap,i+1);
		return Math.max(inc, exc);
	}
}
