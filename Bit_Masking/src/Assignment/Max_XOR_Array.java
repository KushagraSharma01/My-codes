package Assignment;
import java.util.*;
public class Max_XOR_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		long [] a= new long[n];
		long x=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextLong();
			x=x^a[i];
		}
		long max=0;
		for(int i=0;i<a.length;i++) {
			max=Math.max(x^a[i], max);
		}
		System.out.println(max);
	}

}
