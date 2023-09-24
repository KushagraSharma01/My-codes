package lec_1;

public class Check_prime {

	public static void main(String[] args) {
		int n=68;
		System.out.println(ISprime(n));
	}
	public static boolean ISprime(int n) {
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
