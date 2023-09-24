package recursion;

public class Q_13_coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		PrintComb(n,"");
	}

	private static void PrintComb(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		PrintComb(n-1, ans+'H');
		PrintComb(n-1, ans+'T');
		
	}

//	private static void PrintComb(int n, String ans) {
//		// TODO Auto-generated method stub
//		if(n==0) {
//			System.out.println(ans);
//			return;
//		}
//		PrintComb(n-1,ans+'H');
//		PrintComb(n-1,ans+'T');
//	}
	
}
