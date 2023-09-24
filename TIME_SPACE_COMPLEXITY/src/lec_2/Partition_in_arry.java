package lec_2;

public class Partition_in_arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {5,7,2,3,8,9,1,4};
		int ans=partition(arry,0,arry.length-1);
		System.out.println(ans);
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i]+" ");
		}
	}
	public static int partition(int[] arry, int si, int ei) {
		int item=arry[ei];
		int pi=si;
		for (int i = si; i < ei; i++) {
			if(arry[i]<=item) {
				int temp=arry[i];
				arry[i]=arry[pi];
				arry[pi]=temp;
				pi++;
			}
		}
		int temp=arry[pi];
		arry[pi]=arry[ei];
		arry[ei]=temp;
		return pi;	
	}
}
