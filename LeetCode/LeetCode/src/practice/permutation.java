package practice;
import java.util.ArrayList;
public class permutation {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		ArrayList<Integer> ques=new ArrayList<>();
		ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			ques.add(arr[i]);
		}
		ArrayList<Integer> ans=new ArrayList<>();
		permutation(ques, ans,ll);
		System.out.println(ll);
	}

	public static void permutation(ArrayList<Integer> ques, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> ll) {
		if(ques.size()==0) {
			ll.add(ans);
			return;
		}
		for(int i=0;i<ques.size();i++) {
			ans.add(ques.get(i));
			ques.remove(ques.get(i));
			permutation(ques,ans,ll);
		}
		
	}
}
