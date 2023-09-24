package hack;

import java.util.Arrays;

public class slide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-1,-2,-3,-4,-5};
		int k=2;
		int x=2;
		int[] ans=new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            int [] arr=new int[k];
            for(int j=0;j<k;j++){
                arr[j]=nums[i+j];
            }
            Arrays.sort(arr);
            for(int j=0;j<arr.length;j++) {
            	System.out.print(arr[j]+" ");
            }
            System.out.println();
            int q=arr[x-1];
            if(q>=0){
                ans[i]=0;
            }
            else{
                ans[i]=q;
            }
        }
        for(int i=0;i<ans.length;i++) {
        	System.out.print(ans[i]+" ");
        }
	}

}
