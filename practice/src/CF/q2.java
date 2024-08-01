package CF;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a2[] = new int[n];
			int c=0;
			String a = sc.next();
			for(int i=0;i<n;i++) {
				if(a.charAt(i)=='0')
					c++;
				a2[i]=c;
			}
			int in = -1;
			double min=Integer.MAX_VALUE;
//			System.out.println(Math.ceil(((double)(0+1))/2));
			for(int i=0;i<n;i++) {
				if((a2[i]>=Math.ceil(((double)(i+1))/2))&&(((n-c)-(i+1-(a2[i])))>=Math.ceil(((double)(n-i-1))/2))) {
					if(min>Math.abs(((double)n/2)-(i+1))) {
						in=i;
						min=Math.abs(((double)n/2)-(i+1));
					}
				}
				
			}
			if((in==-1||in==n-1)&&(n-c)>=Math.ceil((double)n/2))
				System.out.println("0");
			else
				System.out.println(in+1);
		}
	}

}
