package recursion;

public class Q_40_Comb_2D_array_queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=3;
		comb(2,"",0,0,n,m);
	}
	public static void comb(int qtp,String path,int crow,int ccol,int trow,int tcol) {
		 if(qtp==0) {			//qtp----> Queen to place       crow---->current row       ccol----->current column       trow------>total row         tcol---->total column
			 System.out.println(path);
			 return;
		 }
		 if(ccol>=tcol) {
			 crow++;
			 ccol=0;
		 }
		 if(crow>=trow ) {
			 return;
		 }
		 comb(qtp-1,path+"q{"+crow+","+ccol+"}",crow,ccol+1,trow,tcol);
		 comb(qtp,path,crow,ccol+1,trow,tcol);
	 }

}
