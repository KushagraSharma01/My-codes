package lec8;

public class lec11_DSA {
	public static void main(String[] arg) {
		int[] a= {2,3,4,2,3,5,6};
		Aarray_Except_Self(a);
		
		
	}
	public static int[] Aarray_Except_Self(int[] arry) {
		int[] left=new int[arry.length];
		left[0]=1;
		for(int i=1;i<left.length;i++) {
			left[i]=left[i-1]*arry[i-1];
		}
		int[] right=new int[arry.length];
		right[right.length-1]=1;
		for(int i=right.length-2;i>=0;i--) {
			right[i]=right[i+1]*arry[i+1];
		}
		for(int i=0;i<left.length;i++) {
			left[i]=left[i]*right[i];
		}
		return left;
		}
	}

