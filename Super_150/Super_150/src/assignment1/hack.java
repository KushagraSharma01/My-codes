package assignment1;
import java.util.*;
public class hack {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}