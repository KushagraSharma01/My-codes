package assignment1;

import java.util.*;
public class ques1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=n;
        int c=1;
        long sumo=0;
        long sume=0;
        while(n>0){
            long r=n%10;
            if(c%2==0){
                sume=sume+r;
            }
            else{
                sumo=sumo+r;
            }
            n=n/10;
            c++;
        }
        System.out.println(sumo);
        System.out.println(sume);
    }
}
