package recursion;

public class Q_20_Count_main_path_of_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;		//row
		int m=3;		//column
		System.out.println(PrintAnswer(n,m,0,0,""));
	}
	public static int PrintAnswer(int n, int m,int cc, int cr, String ans) {
		if(cc==m-1 && cr==n-1) {
			//System.out.println(ans);
			return 1;
		}
		if(cc>=m || cr>=n) {
			return 0;
		}
		
		int a=PrintAnswer(n,m,cc,cr+1,ans+"V");
		int b=PrintAnswer(n,m,cc+1,cr,ans+"H");
		return a+b;
	}

}
