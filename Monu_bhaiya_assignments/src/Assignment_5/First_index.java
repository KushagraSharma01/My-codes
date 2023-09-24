package Assignment_5;

public class First_index {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int N=5;
		int[] arry= {3,2,1,2,2};
		int M=2;
		First_index(arry,M,0);
	}
	public static void First_index(int[] arry, int M, int i) {
		if(i==arry.length) {
			System.out.println("-1");
			return;
		}
		if(arry[i]==M) {
			System.out.println(i);
			return;
		}
		First_index(arry,M,i+1);
	}
}