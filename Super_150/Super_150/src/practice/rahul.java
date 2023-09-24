package practice;
import java.util.*;
public class rahul {
	public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []a =new int[n];
		int i=0;
		while(i<n){
			a[i]=sc.nextInt();
			i++;
		}
		int m=sc.nextInt();
		i=0;
		while(i<n){
			if(a[i]==m){
				System.out.println(i);
				break;
			}
			i++;
		}
    }
}
