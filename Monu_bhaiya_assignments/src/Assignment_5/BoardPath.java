package Assignment_5;

public class BoardPath {
	static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=2;
		int M=3;
		Board_Path(0,N,M,"");
		System.out.println("\n"+c);
	}
	public static void Board_Path(int src, int N, int M, String ans) {
		if(src==N) {
			System.out.print(ans+" ");
			c++;
			return;
		}
		if(src>N) {
			return;
		}
		for(int i=1;i<=M;i++) {
			Board_Path(src+i,N,M,ans+i);
		}
	}

	
}
