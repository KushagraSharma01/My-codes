package hack;
import java.util.*;
public class strin {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
        try{
            for(int i=1;;i++){
                String s2=sc.nextLine();
                System.out.println(i+" "+s2);
            }
        }
        catch(Exception e){
            
        }
        sc.close();
    }
}
