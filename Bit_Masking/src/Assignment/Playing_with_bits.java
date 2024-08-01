package Assignment;
import java.util.Scanner;

public class Playing_with_bits{
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int q=sc.nextInt();
		while(q-->0) {
		int l =sc.nextInt();
		int r = sc.nextInt();
		int c=0;
		for(int i=l;i<=r;i++) {
			c+=countsetbits(i);
		}
		System.out.println(c);
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