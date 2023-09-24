package recursion;
public class Q_41_N_Queens {
	public static void main(String[] args) {
		int n=4;
		int m=4;
		boolean[][] board=new boolean[n][m];
		comb(4,"",0,0,n,m,board);
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
		if(issafe(r,c,board)) {
		 	board[r][c]=true;
			comb(qtp-1,path+"q{"+r+","+c+"}",r,c+1,trow,tcol,board);
			board[r][c]=false;
		 }
		 comb(qtp,path,r,c+1,trow,tcol,board);
	 }
	public static boolean issafe(int r, int c,boolean[][] board) {
		// TODO Auto-generated method stub\
		for(int row=r;row>=0;row--) {
			if(board[row][c]) {
				return false;
			}
		}
		for(int col=0;col<c;col++) {
			if(board[r][col]) {
				return false;
			}
		}
		int r1=r;
		int c1=c;
		while(r1>=0 && c1>=0) {
			if(board[r1][c1]) {
				return false;
			}
			r1--;
			c1--;
		}
		int r2=r;
		int c2=c;
		while(r2>=0 && c2<board[0].length) {
			if(board[r2][c2]) {
				return false;
			}
			r2--;
			c2++;
		}
		return true;
	}
}
