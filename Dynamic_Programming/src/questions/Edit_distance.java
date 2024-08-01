package questions;

import java.util.Arrays;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="food";
		String s2="money";
		int [][]dp=new int[s1.length()+1][s2.length()+1];
		for(int []a:dp)
			Arrays.fill(a, -1);
		System.out.println(edist(s1,s2,0,0,dp));
	}
	public static int edist(String s1,String s2,int i,int j,int [][]dp) {
		if(i==s1.length()||j==s2.length()) {
			return Math.max(s1.length()-i, s2.length()-j);
		}
		if(dp[i][j]!=-1)
			return dp[i][j];
		int ans=0;
		if(s1.charAt(i)==s2.charAt(j)) {
			ans=edist(s1,s2,i+1,j+1,dp);
		}
		else {
			//three operations
			int fs=edist(s1,s2,i+1,j,dp);		//delete
			int ss=edist(s1,s2,i+1,j+1,dp);		//replace
			int ts=edist(s1,s2,i,j+1,dp);		//add
			ans=Math.min(fs, Math.min(ss, ts))+1;
		}
		dp[i][j]=ans;
		return ans;
	}

}
