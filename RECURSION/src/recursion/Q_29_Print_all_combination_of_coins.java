package recursion;

public class Q_29_Print_all_combination_of_coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {2,3,5};
		int item=10;
		Print(arry,item,0,"",0);
	}

	private static void Print(int[] arry, int item, int sum, String ans,int idx) {
		if(sum==item) {
			System.out.println(ans);
			return;
		}
		if(sum>item) {
			return;
		}
		for(int i=idx;i<arry.length;i++) {
//			if(sum>item) {
//				return;
//			}
			Print(arry,item,sum+arry[i],ans+arry[i],i);			// with infinite supply put i(we can use multiple times for each index)
			//Print(arry,item,sum+arry[i],ans+arry[i],i+1);		// with finite supply put i+1
			
			
			
			//permutation mai loop zero se chlega
			//combination mai loop us index ke aage se chlega
		}
	}

}
