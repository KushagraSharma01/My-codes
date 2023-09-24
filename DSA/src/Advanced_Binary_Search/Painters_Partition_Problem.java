package Advanced_Binary_Search;

import java.util.Arrays;

public class Painters_Partition_Problem {
	
	public static void main(String[] args) {
		int nop=2;
		int nob=2;
		int[] board= {1,10};
		Arrays.sort(board);
		System.out.println(Minimum(board,nop));
	}

	public static int Minimum(int[] board, int nop) {
		int lo=0;
		int hi=0;
		int ans=0;
		if(board.length==1) {
			return board[0];
		}
		for(int i=0;i<board.length;i++) {
			hi=hi+board[i];
		}
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(ispossible(board,nop,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=lo+1;
			}
		}
		return ans;	
	}

	private static boolean ispossible(int[] board, int nop, int mid) {
		int total_board=0;
		for(int i=0;i<board.length;i++) {
			total_board+=board[i];
		}
		int c=0;
		for(int i=0;i<board.length;i++) {
			if(board[i]<=mid) {
				c+=board[i];
			}
			else {
				c+=mid;
				board[i]=board[i]-mid;
			}
			
			if(c>=total_board) {
				return true;
			}
		}
		return false;
	}
	
}

