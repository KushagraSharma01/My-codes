package recursion;

import java.util.ArrayList;
import java.util.List;

public class Q_33_Combination_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arry= {2,3,6,7};
		int item=7;
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans1=new ArrayList<>();
		Print(arry,item,0,"",0,ll,ans1);
		System.out.println(ans1);
	}
	private static void Print(int[] arry, int item, int sum, String ans,int idx,List<Integer> ll,List<List<Integer>> ans1) {
		if(sum==item) {
			//System.out.println(ans);
			ans1.add(new ArrayList<>(ll));
			return;
		}
		if(sum>item) {
			return;
		}
		for(int i=idx;i<arry.length;i++) {
//			if(sum>item) {
//				return;
//			}
			ll.add(arry[i]);
			Print(arry,item,sum+arry[i],ans+arry[i],i,ll,ans1);		
			ll.remove(ll.size()-1);
			// with infinite supply put i(we can use multiple times for each index)
			//Print(arry,item,sum+arry[i],ans+arry[i],i);		// with finite supply put i+1
			
			
			
			//permutation mai loop zero se chlega
			//combination mai loop us index ke aage se chlega
		}
	}
}
