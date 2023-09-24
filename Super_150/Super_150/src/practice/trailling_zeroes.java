package practice;
import java.util.*;
public class trailling_zeroes {
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		long n=sc.nextLong();
		long i=1;
		long d=0;
		while(i<=n){
			long a=i;
			while(a%5==0) {
				d++;
				a=a/5;
			}
			i++;
		}
		System.out.println(d);
    }
}
