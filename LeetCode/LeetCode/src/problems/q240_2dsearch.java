package problems;

public class q240_2dsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int t=10;
		System.out.println(Search(a,t));
	}
	    public boolean searchMatrix(int[][] matrix, int target) {
	        return Search(matrix,target);
	    }
	    public static boolean Search(int [][] arry,int item) {
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


