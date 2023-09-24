package lec9;

public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,6,-7};	
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);
	}
//	public static void Swap(int a,int b) {
//		int temp=a;
//		a=b									//changes are made in the local variable will not affect the actual array
//		b=temp;
//	}
	public static void Swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];									//changes are made in the actual array 
		arr[j]=temp;
	}
}
