package problems;

public class q189_RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;
				Reverse(nums,0,n-k-1);
				Reverse(nums,n-k,n-1);
				Reverse(nums,0,n-1);
        
    }
    public static void Reverse(int []a,int i,int j) {
				while(i<j) {
					int c=a[j];
					a[j]=a[i];
					a[i]=c;
					i++;				//Two pointer approach
					j--;
				}
}

}
