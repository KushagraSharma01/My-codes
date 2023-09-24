package assignment1;
import java.util.*;
import java.lang.Math.*;
public class ques4 {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long s=0;
        long c=0;
        while(n>0){
            long r=n%10;
            s=s+r*(long)Math.pow(2,c);
            n=n/10;
            c++;
        }
        System.out.println(s);

}
}
