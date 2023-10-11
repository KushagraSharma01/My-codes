package questions;

public class fibo_with_dp {
	//top down
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=90;
		int []dp=new int[n+1];
		for(int i=0;i<dp.length;i++)
			dp[i]=-1;
//		System.out.println(fibo_without_dp(n));
		System.out.println(fibo_with_dp(n,dp));
		System.out.println(dp[5]);
	}
	public static int fibo_without_dp(int n) {
		if(n==1||n==0)
			return n;
		int a=fibo_without_dp(n-1);
		int b=fibo_without_dp(n-2);
		return a+b;
	}
	public static int fibo_with_dp(int n,int []dp) {
		if(n==1||n==0)
			return n;
		if(dp[n]!=-1)
			return dp[n];
		int a=fibo_with_dp(n-1,dp);
		int b=fibo_with_dp(n-2,dp);
		dp[n]=a+b;
		return a+b;
	}
}
