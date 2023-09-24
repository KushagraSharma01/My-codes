package assignment1;
import java.util.*;
import java.lang.Math.*;
public class ques23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		int e=1;
		long s=0;
		while(num>0) {
			long i=num%10;
			s=s+e*(long)Math.pow(10,i);
			e++;
			num=num/10;
		}
		System.out.println(s/10);
}
}
