package lec1;

public class count_set_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count number of set bits in a number
				//right shift the bits of the number then check them individually
				//do this till it becomes 0
		int n = 67;
		System.out.println(count(n));
		//time complexity of count func is constant as it will go maximum to 32 bits O(1)
		//now more optimized approach would be if the loop goes number of set bit times
		System.out.println(count2(n));
	}
	public static int count(int n) {
		int c=0;
		while(n!=0) {
			if((n&1)==1)
				c++;
			n=n>>1;
		}
		return c;
	}
	public static int count2(int n) {
		int c=0;
		while(n!=0) {
			n=n&(n-1);		//011010100(n) & 011010011(n-1) --> 011010000(all zeroes till first one) 
			c++;
		}
		return c;
	}
}
