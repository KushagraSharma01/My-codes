package practice;
import java.util.*;
public class cyclic_sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int[]a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            int tsum=0;
            for(int k=1;k<=n;k++) {
            	int sums=0;
                int ans=a[0];
            	for(int j=0;j<a.length;j++) {			//kadano's algorithm
            		sums+=a[j];
            		ans=Math.max(sums,ans);
            		if(sums<0) {
            			sums=0;
            		}
            	}
            	tsum=Math.max(ans, tsum);
            	Rotate(a,1);
            }
            System.out.println(tsum);
        }
	}
	public static int[] Reverse(int[]a,int s,int e) {
		int i=s;
		int j=e;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return a;
	}
	public static int[] Rotate(int[]a,int k) {
		int n=a.length;
		Reverse(a,0,n-k-1);
		Reverse(a,n-k,n-1);
		Reverse(a,0,n-1);
		return a;
	}
}
