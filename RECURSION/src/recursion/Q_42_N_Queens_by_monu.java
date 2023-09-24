package recursion;

public class Q_42_N_Queens_by_monu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean[][] board=new boolean[n][n];
		NQueens(board,0,n);
	}

	public static void NQueens(boolean[][] board, int row, int tq) {
		if(tq==0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if(isitsafe(board,row,col)==true) {
				board[row][col]=true;
				NQueens(board,row+1,tq-1);
				board[row][col]=false;
			}
		}
		
	}
	public static boolean isitsafe(boolean[][] board, int row, int col) {
		int r=row;
		while(r>=0) {
			if(board[r][col]) {
				return false;
			}
			r--;
		}
		r=row;
		int c1=col;
		while(r>=0 && c1>=0) {
			if(board[r][c1]) {
				return false;
			}
			r--;
			c1--;
		}
		r=row;
		c1=col;
		while(r>=0 && c1<=board[0].length-1) {
			if(board[r][c1]) {
				return false;
			}
			r--;
			c1++;
		}
		return true;
	}

	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]==true) {
					System.out.print("_ ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}
	

}
