package practice;
import java.util.*;
public class kthroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long n=sc.nextLong();
            long k=sc.nextLong();
            System.out.println(kthroot(n,k));
        }
    }
    public static long kthroot(long n,long k){
        long low=1;
        long high=n;
        long ans=0;
        while(low<=high){
            long mid=(low+high)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
	}


