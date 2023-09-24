package assignment1;
import java.util.*;
public class ques15 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        long n=sc.nextLong();
	        long s=0;
	        int c=0;
	        while(n>0){
	            long r=n%8;
	            s=s+r*(long)Math.pow(10,c);
	            n=n/8;
	            c++;
	        }
	        System.out.print(s);
}
}
