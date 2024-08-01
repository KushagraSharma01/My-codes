package Assignment;
import java.util.*;
public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=0;
		for(int i=0;i<=n;i++) {
			if(i<n)
			x=x^sc.nextInt();
			x=x^i;
		}
		System.out.println(x);
	}

}
