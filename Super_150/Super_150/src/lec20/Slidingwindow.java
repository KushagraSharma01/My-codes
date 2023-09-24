package lec20;

public class Slidingwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,4,5,6,7,8,2,3,9,1,5};
		System.out.println(Maximum_sum(arr,4));
	}
	public static int Maximum_sum(int[] arr,int k) {	//k is the window size
		int max=0;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		max=sum;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i];			//window size increased
			sum=sum-arr[i-k];		//window size decreased
			max=Math.max(max, sum);
		}
		return max;
	}

}
