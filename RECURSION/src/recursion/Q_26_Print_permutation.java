package recursion;

public class Q_26_Print_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int tq=2;
		boolean[] board=new boolean[n];
		Permutation(board,tq,0,"");
	}
	public static void Permutation(boolean[] board,int tq,int qpsf,String ans) {//qpsf---->Queen place so far
		if(qpsf==tq)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				Permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				board[i]=false;			//undo//explicit backtracking///////if Recursion cannot perform undo then we do undo by following steps. and it is known as backtracking.
			}
		}
	}
}