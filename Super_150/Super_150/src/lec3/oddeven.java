package lec3;
import java.util.*;// also java.util,Scanner
public class oddeven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//in-built library in which sc is a variable name 
		int n=sc.nextInt();
		System.out.println(n);
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		sc.close();
	}

}
