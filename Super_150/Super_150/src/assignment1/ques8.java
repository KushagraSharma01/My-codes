package assignment1;
import java.util.*;
public class ques8 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int z=1;
        while(row<=n){
            System.out.print(row+"  ");
            if(row>2){
                int i=1;
                
                while(i<=z){
                    System.out.print("0"+"  ");
                    i++;
                }
                z++;
            }
            if(row>1){
                System.out.print(row);
            }
            System.out.println();
            row++;
        }
    }
}
