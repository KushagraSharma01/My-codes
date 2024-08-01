package practice;
import java.util.*;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1200000000;
		int b = 42;
		System.out.println(System.currentTimeMillis());
		System.out.println(gcd1(a, b));
		System.out.println(System.currentTimeMillis());
		System.out.println(gcd3(a, b));
		System.out.println(System.currentTimeMillis());
	}
	public static int gcd1(int a, int b) {
		
//		int r = b;
		while(a!=b) {
			if(a>b)
				a -= b;
			else
				b -= a;
			
		}
		return a;
	}
	public static int gcd2(int a, int b) {
			
			int r = a%b;
			while(r>0) {
				a = b;
				b = r;
				r = a%b;
			}
			return b;
		}
public static int gcd3(int a, int b) {
	
	
	while(a/b!=0) {
		b = a%b;
		a = b;
		
	}
	return a;
}
}
