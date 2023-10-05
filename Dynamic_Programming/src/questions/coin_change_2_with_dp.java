package questions;
	//bottom up
public class coin_change_2_with_dp {
	public static void main(String []args) {
		int [] coin= {1,2,5};
		int amount=5;
		int [][]dp=new int[amount+1][coin.length+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++)
				dp[i][j]=-1;
		}
		System.out.println(coin_change_top_down(coin,amount,0,dp));
	}
	public static int coin_changebottomup(int[] coin,int amount) {
		int [][]dp=new int[amount+1][coin.length+1];
		for(int i=0;i<dp[0].length;i++)
			dp[0][i]=1;
		for(int am=1;am<dp.length;am++) {
			for(int i=1;i<dp[0].length;i++) {
				int inc=0;
				int exc=0;
				if(am>=coin[i-1])
					inc=dp[am-coin[i-1]][i];
				exc=dp[am][i-1];
				dp[am][i]=inc+exc;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
	public static int coin_change_top_down(int[] coin,int amount,int i,int [][]dp) {
		
		if(amount==0)
			return 1;
		if(i==coin.length)
			return 0;
		if(dp[amount][i]!=-1)
			return dp[amount][i];
		int inc=0,exc=0;
		if(amount>=coin[i])
			inc=coin_change_top_down(coin,amount-coin[i],i,dp);		
		exc=coin_change_top_down(coin,amount,i+1,dp);
		dp[amount][i]=inc+exc;
		return inc+exc;									
	}
}
