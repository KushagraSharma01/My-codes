package Questions_Stack_Queue;

import java.util.Arrays;
import java.util.Scanner;

public class Only_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		boolean[] ans=prime(n);			//False---->Prime    // True---->Not prime
//		System.out.println(Arrays.toString(ans));
		int[] ladder=makeladders(n);
		System.out.println("\n"+path(n,0,ladder,""));
	}
	private static int path(int n, int cc, int[] ladder, String ans) {
		if(cc==n) {
			System.out.print(ans+"END , ");
			return 1;
		}
		if(cc>n){
			return 0;
		}
		int count=0;
		if(ladder[cc]!=0) {
			count+=path(n,ladder[cc],ladder,ans+cc+" ");
			return count;
		}
		for(int dice=1;dice<=6;dice++) {
			count+=path(n,cc+dice,ladder,ans+cc+" ");
		}
		return count;
	}
	public static int[] makeladders(int n) {
		boolean[] prime=Prime(n);
		int[] ladders=new int[n+1];
		int i=0;
		int j=prime.length-1;
		while(i<j) {
			while(i<prime.length && prime[i]==true) {
				i++;
			}
			while(j>=0 && prime[j]==true) {
				j--;
			}
			if(i<j) {
				ladders[i]=j;
				i++;
				j--;
			}
		}
		return ladders;
		
		
	}
	public static boolean[] Prime(int n) {
		boolean[] ans=new boolean[n+1];
		ans[0]=ans[1]=true;
		
		for(int i=2;i<ans.length;i++) {
			if(ans[i]==false) {
				for(int j=2;j*i<ans.length;j++) {
					ans[i*j]=true;
				}
			}
		}
		return ans;
		
	}

}
