package practice;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= new int[] {1,2,2,2,3,4,4,4,4};
		int k=removeDuplicates(a);
		System.out.println(k);
		for(int i=0;i<k;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1,c=1;
        for(int i=1;i<n;i++){
           if(nums[i]!=nums[i-1]){ 
            nums[j]=nums[i];
            c++;
            j++;
           }    
        }
        return c;
    }

}
