package CF2;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			int c = sc.nextInt();
			if(a<b&&b<c)
				System.out.println("STAIR");
			else if(a<b&&b>c)
				System.out.println("PEAK");
			else
				System.out.println("NONE");
		}
	}

}
