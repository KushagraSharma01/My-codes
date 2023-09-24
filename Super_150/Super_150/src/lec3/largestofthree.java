package lec3;
import java.util.*;
public class largestofthree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
				System.out.println(a);
			}
		else if(b>a && b>c) { // if the first condition is wrong then && will not check the other condition
				System.out.println(b);// syso+ctrl+space
		}
		else {
			System.out.println(c);
		}
		sc.close();
	}
}
