package hack;
import java.util.*;
public class q4 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        for(int i=1;;i++){
            String s=sc.nextLine();
            System.out.println(i+" "+s);
            if(s=="")
            break;
        }
    }
}
