package lec9;

public class arrays3 {
	public static void main(String[] arg) {
		int [] arr= {10,20,30,40,50};
		int [] other= {100,200300,400,500};
		System.out.println(arr[0]+" "+other[0]);
		Swap(arr,other);
		System.out.println(arr[0]+" "+other[0]);
}
	public static void Swap(int[] arr,int[] other) {
		int[] temp=arr;
		arr=other;										//changes are made in local arrays they point to the original arrays
														//initialised before but not making change in the original arrays until
		other=temp;										//we make changes in the values
		System.out.println(arr[0]+" "+other[0]);		//java is only call by value not call by reference 
	}
}