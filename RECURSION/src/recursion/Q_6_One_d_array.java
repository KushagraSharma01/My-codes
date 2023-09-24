package recursion;

public class Q_6_One_d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {2,3,7,2,5,7,9,7};
		int item=7;
		System.out.println(Index(arry,item,0));
	}
	public static int Index(int[] arry,int item,int i) {
		
		if(i==arry.length) {			//if item is not present in the array
			return -1;
		}
		if(arry[i]==item) {
			return i;
		}
		return Index(arry,item,i+1);
	}
	
}

