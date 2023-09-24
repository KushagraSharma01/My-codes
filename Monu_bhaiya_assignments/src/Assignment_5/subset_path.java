package Assignment_5;

public class subset_path {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {1,2,3};
		int item=3;
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
			Print(arry,item,sum+arry[i],ans+arry[i],idx+1);
		}
	}

}
