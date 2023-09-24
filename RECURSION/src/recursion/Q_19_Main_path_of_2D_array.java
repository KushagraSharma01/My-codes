package recursion;
public class Q_19_Main_path_of_2D_array {
	public static void main(String[] args) {
		int n=3;		//row
		int m=3;		//column
		PrintAnswer(n,m,0,0,"");
	}
	public static void PrintAnswer(int n, int m,int cc, int cr, String ans) {
		if(cc==m-1 && cr==n-1) {
			System.out.println(ans);
			return;
		}
		if(cc>=m || cr>=n) {
			return;
		}
		
		PrintAnswer(n,m,cc,cr+1,ans+"V");
		PrintAnswer(n,m,cc+1,cr,ans+"H");
	}
}