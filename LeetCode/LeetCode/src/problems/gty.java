package problems;

import java.util.ArrayList;

public class gty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3,4,1,2,3,1};
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		while(allzero(nums)) {
			ArrayList<Integer> ls=new ArrayList<>();
			for(int i=0;i<nums.length;i++){
            	if(nums[i]!=0 && issafe(nums[i],ls)){
                	ls.add(nums[i]);
                	nums[i]=0;
            	}
        	}
			list.add(ls);
		}
		System.out.println(list);
	}
	public static boolean allzero(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				return true;
			}
		}
		return false;
	}
	public static boolean issafe(int ele,ArrayList<Integer> ls){
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)==ele){
                return false;
            }
        }
        return true;
    }

}
