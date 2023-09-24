package practice;
import java.util.*;
public class pc1 {		
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		long k=1;
		while(k<=t){
		long a=sc.nextLong();
		long b=sc.nextLong();
		long i=a;
		long c=0;
		while(i<=b){
			long j=2;
			long f=0;
			while(j<=i/2){
				if(i%j==0){
					f++;
					break;
				}
				j++;
			}
			if(i==1 || i==0 || i<0) {
				f=1;
			}
			if(f==0){
				c++;
			}
			i++;
		}
		System.out.println(c);
		k++;
		}
    }
}
