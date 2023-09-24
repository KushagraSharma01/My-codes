package assignment1;
import java.util.*;
public class ques30 {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        int i=0;
        while(i<=n-1){
            a[i]=sc.nextInt();
            i++;
        }
        int j,c;
        int t=sc.nextInt();
        i=1;
        while(i<=t){
            int A=sc.nextInt();
            int k=sc.nextInt();
            j=0;
            c=0;
            while(j<=n-1){
                if(A%a[j]==0){
                    c++;
                }
                j++;
            }
            if(c==k){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            i++;
        }//4
//        100 200 400 100
//        5
//        100 2
//        200 3
//        500 4
//        600 4
//        800 4
    }
}
