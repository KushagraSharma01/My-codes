package additional_ques;

public class q1 {
	//2429. Minimize XOR
	//find a number x such that (x XOR a) is minimum and the count of set bits in x and b are equal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//approach -->  we will start from the left most bit of a and then check which bits are set 
		//then we will reduce the counter by 1 as taking 1 at that bit in x
		//and if the number of set bits will be less than b ten we will add ones from the right side in x
		
		int a = 11;
		int b = 125;
		System.out.println(Min_val(a,b));
		
		
	}
	public static int Min_val(int a, int b) {
		int c = count2(b);
		int x=0;
		for(int i=31;i>=0 && c>0;i--) {
			if((a&(1<<i))!=0){
				x+=(1<<i);
				c--;
			}
		}
		for(int i=0;i<=31 && c>0;i++) {
			if((a&(1<<i))==0) {
				x+=(1<<i);
				c--;
			}
		}
		return x;
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
