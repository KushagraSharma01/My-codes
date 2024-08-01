package Assignment;
import java.util.*;
public class Unique_Number_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		for(int i=0;i<n;i++)
			x=x^sc.nextInt();
		System.out.println(x);
	}

}
