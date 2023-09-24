package practice;
import java.util.*;
public class calculate_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        int q=sc.nextInt();
        for(int i=1;i<=q;i++){
            int x=sc.nextInt();
            if(x!=0)
            Rotate(a,x);
            for(int j=0;j<n;j++){
                a[j]=a[j]+b[j];
            }
            for(int j=0;j<n;j++){
                b[j]=a[j];
            }
            System.out.println();
        }
        int s=0;
        for(int i=0;i<n;i++){
            s=s+a[i];
        }
        s=s%1000000007;
        System.out.println(s);
      
    }
    public static int[] Reverse(int[]a,int s,int e){
        while(s>e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
        return a;
    }
    public static int[] Rotate(int[]a,int k){
        int n=a.length;
        Reverse(a,0,n-1-k);
        Reverse(a,n-k,n-1);
        Reverse(a,0,n-1);
        return a;
    }

}
