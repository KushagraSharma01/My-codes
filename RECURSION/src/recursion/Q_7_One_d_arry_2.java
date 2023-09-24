package recursion;

public class Q_7_One_d_arry_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {2,3,7,2,5,7,9,7};
		int item=2;
		System.out.println(Index(arry,item,arry.length-1));
	}
	public static int Index(int[] arry,int item,int i) {
		
		if(i==-1) {			//if item is not present in the array
			return -1;
		}
		if(arry[i]==item) {
			return i;
		}
		return Index(arry,item,i-1);
	}
}
