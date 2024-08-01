package Assignment;
import java.util.*;
public class Bitwise_AND_Range_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int l =sc.nextInt();
		int r = sc.nextInt();
		int and = l;
		for(int i=l+1;i<=r;i++) {
			and=and&i;
		}
		System.out.println(and);
	}

}
