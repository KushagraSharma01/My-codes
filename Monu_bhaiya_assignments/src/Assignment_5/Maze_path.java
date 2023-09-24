package Assignment_5;

public class Maze_path {
	static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=3;
		int n2=3;
		Permutation(n1,n2,0,0,"");
		System.out.println("\n"+c);
	}

	public static void Permutation(int n1, int n2, int cr, int cc, String ans) {
		if(cr==n1-1 && cc==n2-1) {
			System.out.print(ans+" ");
			c++;
			return;
		}
		if(cr>=n1 || cc>=n2) {
			return;
		}
		Permutation(n1,n2,cr+1,cc,ans+'V');
		Permutation(n1,n2,cr,cc+1,ans+'H');
		
		
	}
	
	
}
