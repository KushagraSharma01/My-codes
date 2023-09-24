package lec10;
import java.util.*;
public class arrayrev {
	public static void main(String[] arg) {
		int[] a= {1,3,1,3,2,4,422,-99};
		Reverse(a);
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void Reverse(int []a) {
		int i=0;
		int j=a.length-1;
		while(i<=j) {
			int c=a[j];
			a[j]=a[i];
			a[i]=c;
			i++;				//Two pointer approach
			j--;
		}
	}
}
