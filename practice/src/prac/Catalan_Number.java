package prac;

import java.util.Arrays;

public class Catalan_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(Catalan(4,dp));
	}
	public static int Catalan(int n, int[] dp) {
		if(n == 0)
			return 1;
		int ans = 0;
		if(dp[n]!=-1)
			return dp[n];
		for(int i=1; i<=n;i++) {
			ans = ans+Catalan(i-1,dp)*Catalan(n-i,dp);
		}
		return dp[n] = ans;
	}

}
