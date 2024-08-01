package lec1;
import java.util.*;
public class Preparing_Olympiad_CF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int []c = new int[n];
		for(int i=0;i<c.length;i++) {
			c[i] = sc.nextInt();
		}
	}	
	public static long Count(int []c, int l,int r, int x) {
		int n = c.length;
		
		for(int i=3;i< (1<<n);i++) {
			if(countsetbit(i)==2 && isitpossible(c,i,l,r,x)) {
				
			}
		}
	}
	public int countsetbit(int n) {
		int c=0;
		while(n!=0) {
			n=n&(n-1);		//011010100(n) & 011010011(n-1) --> 011010000(all zeroes till first one) 
			c++;
		}
		return c;
	}
	public boolean isitpossible(int[] c,int i,int l,int r,int x) {
		
		
		return false;
	}
}
