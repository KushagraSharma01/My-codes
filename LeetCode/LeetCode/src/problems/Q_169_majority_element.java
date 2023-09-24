package problems;

import java.util.Arrays;

public class Q_169_majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,2,1,1,1,2,2};
		Arrays.sort(nums);
        int max=1;
        int ci=0;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                max++;
            }
            else{
                ans=Math.max(ans,max);
                if(ans==max){
                    ci=i-1;
                }
                max=1;
            }
        }
        ans=Math.max(ans, max);
        if(ans==max) {
        	ci=nums.length-1;
        }
        System.out.println(nums[ci]);
	}
}
