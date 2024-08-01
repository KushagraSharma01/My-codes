package String_polynomial_func_hashing;
import java.util.*;
public class Pattern_Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababab";
		Pattern(str,"ab");
	}
	public static void Pattern(String str, String p) {
		long mod = 1000_000_007;
		long pow = 1;
		long pr = 31;
		long hv = 0;
		for(int i=0;i<p.length();i++) {
			int pos = p.charAt(i) - 'a'+1;
			hv = (hv +(pos * pow)%mod)%mod;
			pow = (pow *pr)%mod;
		}
		
		long[] dp = new long[str.length()];
		long[] pa = new long[str.length()];
		dp[0] = str.charAt(0)-'a'+1;
		pa[0] = 1;
		pow = 31;
		for(int i=1;i<str.length();i++) {
			dp[i] = (dp[i-1]+((str.charAt(i) - 'a' + 1)*pow%mod)%mod)%mod;
			pa[i] = pow;
			pow = (pow*pr)%mod;
		}
		
		List<Integer> l1 = new ArrayList<>();
		for(int ei=p.length()-1,si=0;ei<str.length();ei++,si++) {
			long curr = dp[ei];
			if(si>0) {
				curr -= dp[si-1]%mod;
				curr = (curr+mod)%mod;
			}
			if(curr == (hv * pa[si])%mod) {
				l1.add(si+1);
			}
		}
		
		if(l1.size()==0)
			System.out.println("Not Found");
		else 
			System.out.println(l1);
	}

}
