package Assignment;
import java.util.*;
public class Popcount_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int l =sc.nextInt();
		int r = sc.nextInt();
		int max=0,maxnum=0;
		for(int i=l;i<=r;i++) {
			int sbits=countsetbits(i);
			if(max<sbits) {
				max=sbits;
				maxnum=i;
			}
		}
		System.out.println(maxnum);
	}
	public static int countsetbits(int i) {
		int c=0;
		while(i!=0) {
			i=i&(i-1);
			c++;
		}
		return c;
	}
}
