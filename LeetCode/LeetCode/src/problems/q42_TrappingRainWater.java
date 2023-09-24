package problems;

public class q42_TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int trap(int[] height) {
        int []left=new int[height.length];
	left[0]=height[0];
	for(int i=1;i<height.length;i++) {
		int lm=Math.max(left[i-1],height[i]);
		left[i]=lm;
	}
	int []right=new int[height.length];
	right[height.length-1]=height[height.length-1];
	for(int i=height.length-2;i>=0;i--) {
		int rm=Math.max(right[i+1],height[i]);
		right[i]=rm;
	}
	int sum=0;
	for(int i=0;i<height.length;i++) {
		sum=sum-height[i]+Math.min(left[i],right[i]);
	}
        return sum;
    }
	

}
