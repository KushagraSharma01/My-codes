package assignment1;
import java.util.*;
public class ques13 {
	public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=n;
        long s=0;
        int c=0;
        int d=0;
        while(n>0){
            n=n/10;
            d++;
        }
        while(a>0){
            long t=a%10;
            if(c!=d-1){
            if(9-t<t && 9-t>=0){
                s=s+(9-t)*(long)Math.pow(10,c);
            }
            else{
                s=s+t*(long)Math.pow(10,c);
            }
            }
            else if(c==d-1){
                if(9-t<t && 9-t>0){
                    s=s+(9-t)*(long)Math.pow(10,c);
                }
                else{
                    s=s+t*(long)Math.pow(10,c);
                }
            }
            c++;
            a=a/10;
        }
        System.out.println(s);
	}
}
