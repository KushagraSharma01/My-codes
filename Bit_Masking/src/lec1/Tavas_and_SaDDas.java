package lec1;
import java.util.*;
public class Tavas_and_SaDDas {

	
//	You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7.
//For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
//	If we sort all lucky numbers in increasing order, what's the 1-based index of n?
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// no. of numbers before the given number can be calculated as the sum of powers of 2
		// as they are but the total number of permutations of 4 and 7 in different number of digits
		//which comes out to be 2^n - 2 (2^n can be written as 1<<n.(bitwise)
		Scanner sc = new Scanner(System.in);
		String stc = sc.next();
		System.out.println(Index(stc));
		}
	public static int Index(String str) {
		int n = str.length();
		int x = (1<<n) -2; 
		for(int i=str.length()-1 ; i>=0 ; i--) {
			if(str.charAt(i)=='7') {
				x+= (1<<(str.length()-i-1));		//number of bits before current index (2 to the power index)
			}
		}
		return x+1;	//will return the index of that number by adding 1 at last
	}

}
