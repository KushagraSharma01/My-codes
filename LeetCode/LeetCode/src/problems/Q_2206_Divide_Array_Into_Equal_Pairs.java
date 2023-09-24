package problems;
import java.util.Arrays;
public class Q_2206_Divide_Array_Into_Equal_Pairs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  nums= {9,4,18,3,2,6,18,15,7,15,6,4,15,14,7,4,15,4,3,17,9,13,13,12,2,14,12,17};
		int min=1000;
        Arrays.sort(nums);
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c++;
            }
            else{
                min=Math.min(min,c);
                c=1;
            }
        }
        min=Math.min(min,c);
        System.out.println(min);
        for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]+" ");
        }
        System.out.println();
        if(min==1){
             System.out.println(false);
        }
        c=1;
        for(int i=1;i<nums.length;i++) {
        	if(nums[i]==nums[i-1]) {
        		c++;
        	}
        	else {
        		if(c%min!=0) {
        			System.out.println(false);
        		}
        		c=1;
        	}
        }
        System.out.println(true);
	}
}