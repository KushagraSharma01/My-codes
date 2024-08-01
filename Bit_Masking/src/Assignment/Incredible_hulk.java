package Assignment;
import java.util.*;
public class Incredible_hulk {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			System.out.println(count(n));
		}
    }
	public static int count(int n){
		int c=0;
		while(n!=0){
			n=n&(n-1);
			c++;
		}
		return c;
	}
}
