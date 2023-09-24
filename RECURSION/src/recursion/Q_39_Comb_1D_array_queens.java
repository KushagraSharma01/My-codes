package recursion;

public class Q_39_Comb_1D_array_queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comb(0,2,"",4);
	}
	 public static void comb(int col,int qtp,String path,int total_col) {
		 if(qtp==0) {								//total_col--->Size of 1 d array
			 System.out.println(path);
			 return;
		 }
		 if(col>=total_col) {
			 return;
		 }
		 comb(col+1,qtp-1,path+'q'+col,total_col);
		 comb(col+1,qtp,path,total_col);
	 }

}
