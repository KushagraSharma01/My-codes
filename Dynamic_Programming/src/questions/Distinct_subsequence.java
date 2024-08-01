package questions;
import java.util.*;
public class Distinct_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rabbbit";
		String t="rabbit";
		int [][]dp=new int[t.length()+1][s.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++)
				dp[i][j]=-1;
		}
		System.out.println(Ds_with_dp(s,t,0,0,dp));
		
	}
	//from coin change
	// s in place of coin
	//t in place of amount
	public static int Ds(String s,String t,int i,int j) {
		if(j==t.length())
			return 1;
		if(i==s.length())
			return 0;
		int inc=0,exc=0;
		if(s.charAt(i)==t.charAt(j))
			inc=Ds(s,t,i+1,j+1);
		exc=Ds(s,t,i+1,j);
		return exc+inc;
	}
	public static int Ds_with_dp(String s,String t,int i,int j,int[][]dp) {
		if(j==t.length())
			return 1;
		if(i==s.length())
			return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		int inc=0,exc=0;
		if(s.charAt(i)==t.charAt(j))
			inc=Ds(s,t,i+1,j+1);
		exc=Ds(s,t,i+1,j);
		dp[i][j]=exc+inc;
		return exc+inc;
		
	}

}
