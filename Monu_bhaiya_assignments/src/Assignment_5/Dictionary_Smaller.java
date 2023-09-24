package Assignment_5;

import java.util.Arrays;
import java.util.*;
public class Dictionary_Smaller {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    String str1 = sc.next();
	    char arr[] = new char[str1.length()];
	    for (int i = 0; i < str1.length(); i++) {
	        arr[i] = str1.charAt(i);
	    }
	    Arrays.sort(arr);
	    String str = "";
	    for (int i = 0; i < arr.length; i++) {
	    	str += arr[i];
	    }
	    findPermutations(str, "", str1);
	}
	public static void findPermutations(String str, String ans, String str1) {
		if (str.length() == 0) {
			if (str1.compareTo(ans) > 0) {
				System.out.println(ans);
			}
	        return;
		}
		for (int i = 0; i < str.length(); i++) {
			findPermutations(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i), str1);
	    }
	}
}