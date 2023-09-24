package div;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,-3,9,8,10,-1,-2,4,3,6};
		quicksort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void quicksort(int[]arr,int lo,int hi) {
		if(lo>=hi) {
			return;
		}
		int idx=index(arr,lo,hi);
		quicksort(arr,lo,idx-1);
		quicksort(arr,idx+1,hi);
	}
	public static int index(int[] arr,int lo,int hi) {	
		int last_element=arr[hi];	//all the smaller elements will be at the left and larger will be at the right of last element
		int idx=lo;
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=arr[hi]) {
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
		}
		int temp=arr[idx];
		arr[idx]=arr[hi];
		arr[hi]=temp;
		return idx;
	}
}
