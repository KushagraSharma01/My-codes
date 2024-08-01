package String_polynomial_func_hashing;
import java.util.*;
public class NHAY_SPOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			String p = sc.next();
			String t = sc.next();
			KMP(p,t);
		}
	}
	public static void KMP(String p,String t) {
		String s = p+"#"+t;
		
		int [] dp = new int[s.length()];
		int len = 0;
		for(int i=1;i<dp.length;) {
			if(s.charAt(i)==s.charAt(len)) {
				len++;
				dp[i]=len;
				i++;
			}
			else {
				if(len>0)
					len = dp[len-1];
				else
					i++;
			}
		}
		
		for(int i=p.length();i<dp.length;i++) {
			if(dp[i]==p.length())
				System.out.println(i-2*p.length());
		}
		System.out.println();
		
}

}
