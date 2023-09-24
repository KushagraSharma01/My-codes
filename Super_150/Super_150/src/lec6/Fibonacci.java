package lec6;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int i=1;
		while(i<=n) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
		sc.close();
}
}