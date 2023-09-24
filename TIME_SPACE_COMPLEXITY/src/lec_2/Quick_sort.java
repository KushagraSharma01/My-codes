package lec_2;
public class Quick_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {5,7,2,3,8,9,1,4};
		sort(arry,0,arry.length-1);
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i]+" ");
		}
	}
	private static void sort(int[] arry, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pi=partition(arry,si,ei);
		sort(arry,si,pi-1);
		sort(arry,pi+1,ei);
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
