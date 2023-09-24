package assignment1;
import java.util.*;
public class ques2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(2);
        if(n>='a'&&n<'z'){
            System.out.println("lowercase");
        }
        else if(n>='A'&&n<='Z'){
            System.out.println("UPPERCASE");
        }
        else{
            System.out.println("Invalid");
        }
    }
}