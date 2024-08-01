package lec3;
import java.util.*;
public class SOLID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int[] a = {1,2,3,2,5,3,6,7};
		int []lmax = new int[a.length];
		int []rmin = new int[a.length];
		lmax[0] = a[0];
		rmin[a.length-1] = Integer.MAX_VALUE;
		for(int i = 1;i<a.length;i++)
			lmax[i] = Math.max(lmax[i-1], a[i]);
		for(int i=a.length-2;i>=0;i--)
			rmin[i] = Math.min(rmin[i+1], a[i+1]);
		int c = 0;
		for(int i=0;i<a.length-1;i++) {
			if(rmin[i]>=lmax[i])
				c++;
		}
		System.out.println((c+1));
	}

}
