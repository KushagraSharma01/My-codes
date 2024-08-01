package prac;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b<2*a) {
				if(n%2==0) {
					System.out.println(b*(n/2));
				}
				else
					System.out.println(((b*(n/2))+a));
			}
			else
					System.out.println(a*n);
		}
	}

}
