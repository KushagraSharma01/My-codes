package new_problems;

public class Next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bae".compareTo("be"));
	}

	
	
	
	
	
	//Brute Force
	
//	class Solution {
//	    public void nextPermutation(int[] nums) {
//	        boolean [] vis = new boolean[nums.length];
//	        List< List<Integer>> l1 = new ArrayList<>();
//	        permutations(nums, vis, l1, new ArrayList<>());
//	        Collections.sort(l1, new Comparator<List<Integer>>(){
//	            public int compare(List<Integer> o1, List<Integer> o2){
//	                for(int i=0;i<o1.size();i++){
//	                    if(o1.get(i) != o2.get(i))
//	                        return o1.get(i) - o2.get(i);
//	                }
//	                return 0;
//	            }
//	        });
//	        // System.out.println(l1);
//	        for(int i=0;i<l1.size();i++){
//	            int c=0;
//	            for(int j=0;j<l1.get(i).size();j++){
//	                if(nums[j]==l1.get(i).get(j))
//	                    c++;
//	            }
//	            if(c==nums.length){
//	                if(i!=l1.size()-1){
//	                    for(int j=0;j<nums.length;j++){
//	                        nums[j] = l1.get(i+1).get(j);
//	                    }
//	                }
//	                else{
//	                    for(int j=0;j<nums.length;j++){
//	                        nums[j] = l1.get(0).get(j);
//	                    }
//	                }
//	                return;
//	            }
//	        }
//	        System.gc();
//	    }
//	    public void permutations(int[] nums, boolean[] vis, List< List<Integer>> l1,List<Integer> l2){
//	        if(l2.size() == nums.length){
//	            l1.add(new ArrayList<>(l2));
//	            return;
//	        }
//	        for(int i=0;i<nums.length;i++){
//	            boolean flag = false;
//	            for(int j=i+1;j<nums.length;j++){
//	                if(nums[i]==nums[j] && !vis[j]){
//	                    flag = true;
//	                    break;
//	                }
//	            }
//	            if(!vis[i]&&!flag){
//	                vis[i] = true;
//	                l2.add(nums[i]);
//	                permutations(nums, vis, l1, l2);
//	                l2.remove(l2.size()-1);
//	                vis[i] = false;
//	            }
//	        }
//	    }
//	}
}
