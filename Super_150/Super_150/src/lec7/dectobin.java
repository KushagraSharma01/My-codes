package lec7;

public class dectobin {
	public static void main(String[] args) {
		int n=17;
		int sum=0;
		int mul=1;		//10^0
		while(n>0) {
			int rem=n%2;
			sum=sum+rem*mul;
			n=n/2;
			mul=mul*10;
		}
		System.out.println(sum);
	}
}
