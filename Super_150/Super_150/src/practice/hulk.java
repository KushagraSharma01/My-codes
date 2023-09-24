package practice;
import java.util.*;
public class hulk {
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int j=1;
		while(j<=t) {
		int n=sc.nextInt();
		int a=1;
		int i=0;
		int d=0;
		while(i<=n) {
			if(a>=n) {
				if(a==n) {
					d++;
					break;
				}
				d++;
				a=a/2;
				n=n-a;
				i=0;
				a=1;
			}
			i++;
			a=a*2;
		}
		System.out.println(d);
		j++;
		}
	}
}
