package Assignment_5;

public class Generate_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		paranthesis(n,0,0,"");
	}

	public static void paranthesis(int n, int open, int close, String ans) {
		if(open==n && close==n) {
			System.out.println(ans);
			return;
		}
		if(open>n) {
			return;
		}
		if(close>open) {
			return;
		}
		
		
		paranthesis(n,open+1,close,ans+'(');
		paranthesis(n,open,close+1,ans+')');
		
	}
	

}
