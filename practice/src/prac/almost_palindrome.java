package prac;
import java.util.*;
public class almost_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		List<Character> l1 = new ArrayList<>();
		int left=0, right=str.length()-1;
		while(left<=right) {
			if(str.charAt(left) != str.charAt(right)) {
				if(left+1 != right) {
					if(str.charAt(left) != str.charAt(right-1)) {
						l1.add(str.charAt(left));
						left++;
						continue;
					}
					if(str.charAt(right) != str.charAt(left+1)) {
						l1.add(str.charAt(right));
						right++;
						continue;
					}
				}
				else {
					l1.add(str.charAt(left));
					l1.add(str.charAt(right));
				}
			}
			left++;
			right--;
		}
		Collections.sort(l1);
		System.out.println(l1.get(0));
	}

}
