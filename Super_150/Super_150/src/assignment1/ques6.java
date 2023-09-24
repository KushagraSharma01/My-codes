package assignment1;
import java.util.*;
import java.lang.Math.*;
public class ques6 {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int i=1;
		    while(i<=n){
		        int b=sc.nextInt();
		        int s=0;
		        int c=0;
		        while(b>0){
		            int r=b%10;
		            s=s+r*(int)Math.pow(2,c);
		            b=b/10;
		            c++;
		        }
	            i++;
		        System.out.println(s);
		    }
}}
