package assignment1;
import java.util.*;
public class ques18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long i=1;
        while(i<=n){
            long s=0;
            long num=sc.nextLong();
            while(num>0){
                long r=num%10;
                s=s+r;
                num=num/10;
            }
            if(s%2==0){
            	if(s%4==0) {
                System.out.println("Yes");
            }}
            else if(s%2==1){
                if(s%3==0){
                    System.out.println("Yes");
                }
            }
            else{
                System.out.println("No");
            }
            i++;
        }
	}
}
