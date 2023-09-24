package Assignment_5;
import java.util.*;
public class Recursion_twins {
	static int c=0;
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        twins(str,0);
        System.out.println(c);
    }
    public static void twins(String str,int i){
        if(str.length()<=2) {
        	return;
        }
    	String ch=str.substring(0,1);
        if(str.length()>2 && str.substring(2,3).equals(ch)){
            c++;
        }     
        twins(str.substring(1),i+1);
    }
}
