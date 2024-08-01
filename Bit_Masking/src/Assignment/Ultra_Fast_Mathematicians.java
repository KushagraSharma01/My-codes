package Assignment;
import java.util.*;
public class Ultra_Fast_Mathematicians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
		String str1 = sc.next();
		String str2 = sc.next();
		String ans = "";
		for(int i=0;i<str1.length();i++)
			ans+=((str1.charAt(i)-'0')^(str2.charAt(i)-'0'));
		System.out.println(ans);
		}
		
	}

}
