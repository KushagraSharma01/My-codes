package recursion;

import java.util.ArrayList;
import java.util.List;

public class Q_32_combination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=2;
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans1=new ArrayList<>();
		Combination(n,k,"",1,ll,ans1);
		System.out.println(ans1);
	}
	public static void Combination(int n, int k,String ans,int idx,List<Integer>ll,List<List<Integer>> ans1) {
		if(k==0) {
			//System.out.println(ans);
			ans1.add(new ArrayList<>(ll));
			return;
		}
		for(int i=idx;i<=n;i++) {
			ll.add(i);
			Combination(n,k-1,ans+i+" ",i+1,ll,ans1);
			ll.remove(ll.size()-1);

		}
	}
}
