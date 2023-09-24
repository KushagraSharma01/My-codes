package assignment1;
import java.util.*;
public class ques29 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        long i=1;
        while(i<=t){
            long s1=0;
            long s2=0;
            long a=1;
            long h=2;
           long m=sc.nextLong();
           long n=sc.nextLong();
           long j=0;
           while(s1<=m){
               s1=s1+a;
               a+=2;
           }
           while(s2<=n){
               s2=s2+h;
                h+=2; 
           }
           if(s1>s2){
               System.out.println("Aayush");
           }
           else if(s2>s1){
               System.out.println("Harshit");
           }
           i++;
        }
    }
}
