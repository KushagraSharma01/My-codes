package lec8;
import java.util.*;
import java.lang.Math.*;
public class RainWaterTrapping {
public static void main(String[] arg) {
	
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

