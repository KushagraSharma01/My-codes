package questions;

public class coin_change_2 {
	public static void main(String []args) {
		int [] coin= {1,2,5};
		int amount=5;
		System.out.println(coin_change(coin,amount,0));
	}
	public static int coin_change(int[] coin,int amount,int i) {
		
		if(amount==0)
			return 1;
		if(i==coin.length)
			return 0;
		int inc=0,exc=0;
		if(amount>=coin[i])
			inc=coin_change(coin,amount-coin[i],i);		//forward recursion (answer calculating going down the stack)
		exc=coin_change(coin,amount,i+1);				//so the first answer will include all the cases at first
		return inc+exc;									//then the indexes(values) will start to eliminate (exclusion)
	}
}
