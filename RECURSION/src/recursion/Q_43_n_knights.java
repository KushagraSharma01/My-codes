package recursion;
public class Q_43_n_knights {
	public static void main(String[] args) {
		int n=4;
		int m=4;
		boolean[][] board=new boolean[n][m];
		comb(8,"",0,0,n,m,board);
	}
	public static void print(boolean[][] board) {
		for(boolean[] row:board) {
			for(boolean p: row) {
				if(p) {
					System.out.print("_");			//queen is there
				}
				else {
					System.out.print(".");			//queen is not there
				}
			}
			System.out.println();
		}
		System.out.println("===========");
	}
	public static void comb(int qtp,String path,int r,int c,int trow,int tcol,boolean[][] board) {
		 if(qtp==0) {
			 System.out.println(path);
			 print(board);
//			 r++;				// we increase row because in same row we can't place another queen in same row...same in next column
//			 c++;		
			 return;
		 }
		 if(c>=tcol) {
			 r++;
			 c=0;
		 }
		 if(r>=trow ) {
			 return;
		 }
		if(isitsafe(board,r,c)) {
		 	board[r][c]=true;
			comb(qtp-1,path+"q{"+r+","+c+"}",r,c+1,trow,tcol,board);
			board[r][c]=false;
		 }
		 comb(qtp,path,r,c+1,trow,tcol,board);
	}
	public static boolean isitsafe(boolean[][] board, int row, int col) {
		int r=row-2;
		int c=col-1;
		if(r>=0 && c>=0 &&board[r][c]) {
			return false;
		}
		r=row-2;
		c=col+1;
		if(r>=0 && c<=board[0].length-1&&board[r][c]) {
			return false;
		}
		r=row-1;
		c=col-2;
		if(r>=0 && c>=0 &&board[r][c]) {
			return false;
		}
		r=row-1;
		c=col+2;
		if(r>=0 && c<=board[0].length-1&&board[r][c]) {
			return false;
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
