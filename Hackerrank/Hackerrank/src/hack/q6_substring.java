package hack;
import java.util.*;
public class q6_substring {
	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int s=A.length() +B.length();
        System.out.println(s);
        if(A.charAt(0)>B.charAt(0))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
        //substring makes a smaller string of the original string
    }
}
