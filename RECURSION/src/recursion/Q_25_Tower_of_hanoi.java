package recursion;
import java.util.*;
public class Q_25_Tower_of_hanoi {

	
	
	    public static void main(String [] args){
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	            int n=sc.nextInt();
	            int[]a=new int[n];
	            for(int i=0;i<n;i++)
	                a[i]=sc.nextInt();
	            int k=0;
	            int j=a.length-1;
	            Arrays.sort(a);
	            int sum=0;
	            while(k<=j){
	                sum+=a[j]-a[k];
	                k++;
	                j--;
	            }
	            System.out.println(sum);
	        }
	    }
	}
