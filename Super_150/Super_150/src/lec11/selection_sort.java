package lec11;

public class selection_sort {
	public static void main(String[] arg) {
		int[] arr= {2,5,7,1,4,3};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int mini=i;						//minimum index
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[mini]) {			//finding the index of the smallest number at the right of the given number/index
					mini=j;
				}
			}
			int temp=arr[i];					//Swapping the current number with the smallest number on it's right side
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
	}
}
