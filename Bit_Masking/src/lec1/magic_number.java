package lec1;

public class magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5.
		//First few magic numbers are 5,25,30(25+5),125,130(125+5)...
		
		//all the numbers formed in above series will be same as giving bits with a weight of 5;
		//as we do in binary bits
		
		int n=5;
		int c=1;		//starting with c=1 as the first element is 5
		int ans=0;
		while(n!=0) {
			if((n&1)==1) {
				ans+=(int)Math.pow(5, c);
			}
			n=n>>1;
			c++;
		}
		System.out.println(ans);
	}

}
