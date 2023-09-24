package assignment1;
import java.util.*;
public class ques20 {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        while(row<=n){
            int j=1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            if(row==1 || row==n){
                int k=1;
                while(k<=n){
                    System.out.print("*");
                    k++;
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                j=1;
                while(j<=n-2){
                    System.out.print(" ");
                    j++;
                }
                System.out.println("*");
            }
            
            row++;
            space--;
        }
    }
}
