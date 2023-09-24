package lec20;

public class slidingproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,4,5,6,7,8,2,3,9,1,5,2};
		System.out.println(CountSubArray(arr,3));
	}
	// Window size is not fixed 
	public static int CountSubArray(int[] arr,int k) {
		int ans=0;
		int si=0;
		int ei=0;
		int p=1;
		while(ei<arr.length ) {
			//grow
			p*=arr[ei];
			//shrink
			while(p>=k && si<=ei) {
				p/=arr[si];
				si++;
			}
			//ans calculate
			ans=ans+(ei-si+1);				//number of subarray is equal to the window size here because we are taking single 
			ei++;							//subarray from starting
		}
		return ans;
	}
}
