package assignment1;
import java.util.*;
public class ques9 {
	  public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        int min=sc.nextInt();
	        int max=sc.nextInt();
	        int st=sc.nextInt();
	        int i=1;
	        int s=min;
	        while(i<=(max/st)+1){
	            System.out.print(s+"    ");
	            int c=(5*(s-32))/9;
	            System.out.println(c);
	            s=s+st;
	            i++;
	        }
	    }
}
