package recursion;

public class Q_27_Queen_combination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int tq=2;
		boolean[] board=new boolean[n];
		Combination(board,tq,0,"",0);
	}
	public static void Combination(boolean[] board,int tq,int qpsf,String ans,int idx) {//qpsf---->Queen place so far
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				Combination(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				board[i]=false;			//undo//explicit backtracking///////if Recursion cannot perform undo then we do undo by following steps. and it is known as backtracking.
				
			}
		}
	}
}
