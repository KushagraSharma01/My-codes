package assignment1;
import java.util.*;
public class ques21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] array=new long[n];
        int i=0;
        while(i<=n-1){
            array[i]=sc.nextLong();
            i++;
        }
        long m=sc.nextLong();
        i=0;
        int c=0;
        while(i<=n-1){
            if(array[i]==m){
                System.out.println(i);
                c++;
                break;
            }
            i++;
        }
        if(c==0){
            System.out.println("-1");
        }
}}
