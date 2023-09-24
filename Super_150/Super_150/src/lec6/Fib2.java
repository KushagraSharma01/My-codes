package lec6;

import java.util.Scanner;

public class Fib2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.print(a);
		sc.close();
}

}
