package lec6;
import java.util.*;
public class hcf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int r=a%b;
		while(r>0) {
			a=b;
			b=r;
			r=a%b;
		}
			
		
		System.out.println(b);
		sc.close();
	}
}
