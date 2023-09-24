package assignment1;
import java.util.*;
public class ques26 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		int i=0;
		while(i<=n-1) {
			a[i]=sc.nextInt();
			i++;
		}
		int t=sc.nextInt();
		int j=0;
		while(j<=n-1) {
			int e=a[j];
			i=j+1;
			while(i<=n-1) {
				if(t-e==a[i]) {
					if(e<a[i]) {
					System.out.println(e+" and "+a[i]);
				}	
					else {
					System.out.println(a[i]+" and "+e);
				}
					}
				i++;
			}
			j++;
		}
    }
}
