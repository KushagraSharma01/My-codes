package recursion;

public class Q_1_factorial {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n));
	}
	public static int fac(int n) {
		if(n==0) {
			return 1;
		}
		//System.out.println("hello");
		int fn=fac(n-1);  	//n=k			//call stack made
		//System.out.println(n*fn);			//call stack delete
		return n*fn;	//n=k+1
	}
//	public static int fac(int n) {
//		if(n==0) {
//			return 1;
//		}
//		return n*fac(n-1);
//		
//	}
//	public static int fac(int n,int ans) {
//		if(n==0) {
//			return ans;
//		}
//		return fac(n-1,ans*n);
//	}
}