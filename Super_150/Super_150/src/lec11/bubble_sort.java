package lec11;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {334,5,4,92,1};
		Sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void Sort(int[] arr) {
		for(int pass=1;pass<arr.length;pass++) {
			for(int j=0;j<arr.length-pass;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
	}
}
