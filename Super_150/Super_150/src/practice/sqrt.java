package practice;
import java.util.*;
public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            double n=sc.nextDouble();
            System.out.format("%.4f",kthroot(n));
            System.out.println();
        }
    }
    public static double kthroot(double n){
        double low=0.00001;
        double high=n;
        double ans=0;
        while(low<=high){
            double mid=(low+high)/2;
            if(Math.pow(mid,2)==n){
                ans=mid;
                return ans;
            }
            else if(Math.pow(mid,2)<n){
                ans=mid;
                low=mid+0.00001;
            }
            else if(Math.pow(mid,2)>n)
                high=mid-0.00001;
        }
        ans=ans-0.0001;
        return ans;
    }
}