package recursion;

public class Q_15_coins_without_two_consecutive_head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		PrintComb(n,"");
	}
	private static void PrintComb(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			PrintComb(n-1,ans+'H');
		}
		PrintComb(n-1,ans+'T');
	}
}