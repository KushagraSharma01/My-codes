package pc;
import java.util.*;

public class pcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0) {
				String str = sc.next();
				int a=0;
				int b=0;
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)=='A')
						a++;
					else
						b++;
				}
				if(a>b)
					System.out.println("A");
				else
					System.out.println("B");
			}
	}

}
