package practice;
import java.util.*;
public class pp1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int []a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            int m=sc.nextInt();
            int mindiff=1000001;
            int diff=0;
            int i1=0,i2=0;
            for(int j=0;j<n;j++){
                int ele=a[j];
                for(int k=j+1;k<n;k++){
                    if((ele+a[k])==m){
                        if(ele>=a[k]){
                            diff=ele-a[k];
                        }
                        else{
                            diff=a[k]-ele;
                        }
                        if(mindiff>diff){
                            mindiff=diff;
                            if(ele>=a[k]){
                                i1=k;
                                i2=j;
                            }
                            else{
                                i1=j;
                                i2=k;
                            }
                        }
                    }
                }
                
            }
            System.out.println(a[i1]+" "+a[i2]);
            System.out.println();
        }
    }
}
