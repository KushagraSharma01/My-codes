package Assignment_5;

public class N_Triangle_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=3;
		System.out.println(triangle(N));
	}

	public static int triangle(int N) {
//		if(N==0) {
//			return ans;
//		}
//		return triangle(N-1,ans+N);
		if(N==0) {
			return 0;
		}
		int fn=triangle(N-1);
		return fn+N;
	}
}
