package lec10;
import java.util.*;
public class arraymax {
public static void main(String[] arg) {
	int [] a= {1,3,1,3,2,4,422,-99};
	System.out.println(max(a));
}
public static int max(int []a) {
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	return max;
}
}
