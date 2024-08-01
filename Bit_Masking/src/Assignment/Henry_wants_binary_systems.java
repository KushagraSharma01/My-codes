package Assignment;
import java.util.*;
public class Henry_wants_binary_systems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n =sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.print(countsetbits(i)+" ");
		}
	}
	public static int countsetbits(int i) {
		int c=0;
		while(i!=0) {
			i=i&(i-1);
			c++;
		}
		return c;
	}

}
