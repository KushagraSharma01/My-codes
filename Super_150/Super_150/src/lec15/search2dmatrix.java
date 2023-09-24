package lec15;
import java.util.*;
public class search2dmatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,4}};
		int t=4;
		System.out.println(Search(a,t));
	}
	    public boolean searchMatrix(int[][] matrix, int target) {
	        return Search(matrix,target);
	    }
	    public static boolean Search(int [][] arry,int item) {		//applied on sorted matrix ,sorted along row and coloumn
			int row=0;
			int col=arry[0].length-1;
			while(row<arry.length && col>=0) {
				if(arry[row][col]==item) {
					return true;
				}
				else if(arry[row][col]>item) {
					col--;
				}
				else {
					row++;
				}
			}
			return false;
		}
}
