package assignment1;
import java.util.*;
public class ques7 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int row=0;
    int num=1;
    while(row<=n){
        int i=1;
        while(i<=row){
            System.out.print(num+"  ");
            i++;
            num++;
        }
        System.out.println();
        row++;
    }
}
}
