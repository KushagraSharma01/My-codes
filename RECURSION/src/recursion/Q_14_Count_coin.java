package recursion;

public class Q_14_Count_coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println("\n"+PrintComb(n,""));
	}

	private static int PrintComb(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.print(ans+" ");
			return 1;
		}
		int a=PrintComb(n-1,ans+'H');
		int b=PrintComb(n-1,ans+'T');
		return a+b;
	}
}
