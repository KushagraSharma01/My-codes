package assignment1;
import java.lang.Math.*;
import java.util.*;
public class ques16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long sb=sc.nextLong();
		long db=sc.nextLong();
		long sn=sc.nextLong();
		if(sb!=10) {
			long a=sn;
			int c=0;
			long s=0;
			while(a>0) {
				long r=a%10;
				s=s+r*(long)Math.pow(sb,c);
				c++;
				a=a/10;
			}
			sn=s;
		}
			long s1=0;
	        int d=0;
	        long b=sn;
	        while(b>0){
	            long r=b%db;
	            s1=s1+r*(long)Math.pow(10,d);
	            b=b/db;
	            d++;
	        }
			sn=s1;
		System.out.println(sn);
	}	
}
