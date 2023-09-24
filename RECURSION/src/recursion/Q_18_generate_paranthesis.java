package recursion;
import java.util.ArrayList;
import java.util.List;
public class Q_18_generate_paranthesis {
	public static void main(String[] args) {
		int n=3;
		List<String> ll=new ArrayList<>();
		Paranthesis(n,"",0,0,ll);
		System.out.println(ll);
	}
	public static void Paranthesis(int n,String ans,int open,int close,List<String> ll) {
		if(open==n && close==n) {
			//System.out.print(ans+" ");
			ll.add(ans);
			return;
		}
		if(open<n) {
			Paranthesis(n,ans+"(",open+1,close,ll);
		}
		if(close<open) {
			Paranthesis(n,ans+")",open,close+1,ll);
		}
	}	
}