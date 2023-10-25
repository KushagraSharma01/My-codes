package questions;

import java.util.Arrays;

public class Wine_Problem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []wine= {2,3,5,1,4};
		int [][]dp=new int[wine.length][wine.length];
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(max_profit(wine,0,wine.length-1,1,dp));
		System.out.println(max_profitBU(wine));
		
	}
	public static int max_profit(int []wine,int i,int j,int year,int [][]dp) {
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=-1)
			return dp[i][j];
		int f=wine[i]*year+max_profit(wine,i+1,j,year+1,dp);
		int l=wine[j]*year+max_profit(wine,i,j-1,year+1,dp);
		dp[i][j]=Math.max(f, l);
		return Math.max(f, l);
	}
	
	public static int max_profitBU(int []wine) {
		int year=wine.length;
		int [][]dp=new int[wine.length][wine.length];
		for(int i=0;i<dp.length;i++) {
			dp[i][i]=wine[i]*year;
		}
		year--;
		for(int slide=1;slide<dp.length;slide++) {
			for(int j=slide;j<dp.length;j++) {
				int i=j-slide;
				int f=wine[i]*year+dp[i+1][j];
				int l=wine[j]*year+dp[i][j-1];
				dp[i][j]=Math.max(f, l);
			}
			year--;
		}
		return dp[0][dp.length-1];
	}
}
