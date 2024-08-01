package pc;
import java.util.*;
public class pcp3 {
	static long a[] = new long[2000000];
	static long ans[] = new long[2000000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			if(ans[n]!=0)
				System.out.println(ans[n]);
			else {
				long s=0;
				int c=0;
				for(int i=1;i<=n;i++) {
					int next = i%10;
					if(a[i]==0) {
					a[i]=(next+a[i/10]);
					}
					ans[i] = ans[i-1]+a[i];
					s+=a[i];
				}
				System.out.println(s);
			}
			
		}
	}
//	public static long sum(int n) {
//		long s=0;
//		while(n>0) {
//			s+=n%10;
//			n=n/10;
//		}
//		return s;
//	}

}
