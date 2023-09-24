package recursion;

public class Q_28_Print_all_permutation_of_coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {2,3,5};
		int item=10;
		Print(arry,item,0,"");
	}

	private static void Print(int[] arry, int item, int sum, String ans) {
		if(sum==item) {
			System.out.println(ans);
			return;
		}
//		if(sum>item) {
//			return;
//		}
		for(int i=0;i<arry.length;i++) {
			if(sum>item) {
				return;
			}
			Print(arry,item,sum+arry[i],ans+arry[i]);
		}
	}
}
