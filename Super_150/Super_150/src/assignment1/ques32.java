package assignment1;
import java.util.*;
public class ques32 {
	public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        int i=0;
        while(i<=n-1){
            a[i]=sc.nextInt();
            s=s+a[i];
            System.out.print(s+" ");
             i++;
        }
    }
}
