package hack;
import java.util.*;
public class pallin {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l=A.length()-1;
        String B="";
        for(int i=l;i>=0;i--){
            B=B+A.charAt(i);
        }
        if(A.equals(B)){
            System.out.println("Yes");
        }
        else
        System.out.println("No");
    }
}
