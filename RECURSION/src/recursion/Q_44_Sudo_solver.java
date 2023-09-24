package recursion;

public class Q_44_Sudo_solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= { {3, 0, 6, 5, 0, 8, 4, 0, 0},
						{5, 2, 0, 0, 0, 0, 0, 0, 0},
						{0, 8, 7, 0, 0, 0, 0, 3, 1},
						{0, 0, 3, 0, 1, 0, 0, 8, 0},
						{9, 0, 0, 8, 6, 3, 0, 0, 5},
						{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
						{1, 3, 0, 0, 0, 0, 2, 5, 0},
						{0, 0, 0, 0, 0, 0, 0, 7, 4},
						{0, 0, 5, 2, 0, 6, 3, 0, 0} };
		Sudoku(grid,0,0);
	}
	public static void Sudoku(int[][] board, int row, int col) {
		if(col==board[0].length) {
			row++;
			col=0;
		}
		if(row==board.length) {			//in this row sudoku is solved because we cross the sudoku board and our row is outside from the board
			Display(board);
			return;					
		}
		if(board[row][col]!=0) {
			Sudoku(board,row,col+1);
		}
		else {
			for (int val = 1; val <=board[0].length; val++) {
				if(isitsafe(board,row,col,val)) {
					board[row][col]=val;
					Sudoku(board, row, col+1);
					board[row][col]=0;
				}
						
			}
		}
		
	}
	public static boolean isitsafe(int[][] board, int row, int col, int val) {
		int r=row;
		for(int c=0;c<board[0].length;c++) {
			if(board[r][c]==val) {
				return false;
			}
		}
		int c=col;
		for(r=0;r<board.length;r++) {
			if(board[r][c]==val) {
				return false;
			}
		}
		//3*33 matrix
		r=row-row%3;
		c=col-col%3;
		for (int i = r; i < r+3; i++) {
			for (int j = c; j<c+3; j++) {
				if(board[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void Display(int[][] board) {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
