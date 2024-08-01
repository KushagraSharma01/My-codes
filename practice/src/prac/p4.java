package prac;
import java.util.*;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long c[] = new long[n];
		Integer b[] = new Integer[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextLong();
			c[i] = a[i]*(i+1)*(n-i);
		}
		for(int i=0;i<n;i++)
			b[i] = sc.nextInt();
		long s = 0;
		Arrays.sort(c);
		Arrays.sort(b, Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			s=(s+((c[i]%998244353)*(b[i]%998244353))%998244353)%998244353;
		}
		System.out.println((int)s);
	}

}
