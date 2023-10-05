package questions;

public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []wt= {1,2,3,2,2};
		int []val= {8,4,0,5,3};
		int cap=4;
	}
	public static int knapsack(int []wt,int[]val,int cap,int i) {
		if(i==wt.length||cap==0)
			return 0;
		int inc=0,exc=0;
		if(cap>=wt[i]) {
			inc= val[i]+knapsack(wt,val,cap-wt[i],i+1);
		}
		exc=knapsack(wt,val,cap,i+1);
		return Math.max(inc, exc);
	}
}
