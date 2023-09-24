package recursion;

public class Q_9_A_to_the_power_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=3;
		int ans=1;
		System.out.println(pow(a,b,ans));
	}
		// BY TAIL RECURSION
	public static int pow(int a, int b,int ans) {
		if(b==0) {
			return ans;
		}
		return pow(a,b-1,ans*a);
	}
		
}
