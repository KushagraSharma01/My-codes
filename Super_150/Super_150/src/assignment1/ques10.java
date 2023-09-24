package assignment1;
import java.util.*;
public class ques10 {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=2;
        int c=0;
        while(i<num){
            if(num%i==0){
                c++;
            }
            i++;
        }
        if(c==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
