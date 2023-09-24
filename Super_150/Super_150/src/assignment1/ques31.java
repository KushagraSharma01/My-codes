package assignment1;
import java.util.*;
public class ques31 {
	public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int a[]=new int[n];
        int b[]=new int[n];
        while(i<=n-1){
            a[i]=sc.nextInt();
            b[i]=a[i]*a[i];
            i++;
        }
        i=0;
        while(i<=n-1){
            int min=b[i];
            if(min>=b[i+1]){
                min=b[i+1];
                b[i+1]=a[i];
                a[i]=min;
                }
                i++;
            }
            
        
        i=0;
        while(i<=n-1){
            System.out.print(b[i]+" ");
            i++;
        }
    }
}
