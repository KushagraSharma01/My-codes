package recursion;

public class Q_4_Factorial_tail_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=1;
		System.out.println(fact(n,ans));
	}
	public static int fact(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return fact(n-1,ans*n);
	}
	
}
