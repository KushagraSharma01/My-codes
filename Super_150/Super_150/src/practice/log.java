package practice;
import java.lang.Math;
public class log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=243;
		int a=(int)(Math.log10(n)/Math.log10(3));
		if((int)Math.pow(3,a)==n) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
