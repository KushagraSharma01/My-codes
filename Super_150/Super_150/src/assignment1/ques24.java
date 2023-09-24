package assignment1;
import java.util.*;
public class ques24 {
	public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
        int i=0;
        while(i<=n-1) {//Array cannot be initialised at index other than 0 but can be updated at any index.
        	b[i]=0;
        	i++;
        }
        i=0;
        while(i<=n-1){
            a[i]=sc.nextInt();
            
            b[a[i]]=i;
            i++;
        }
        i=0;
        while(i<=n-1) {
        	System.out.print(b[i]+" ");
        	i++;
        }
//        Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		int b[] = new int[n];
//		int p = 0;
//		int val = 0;
//		int c;
//		for(int i = 0;i<n;i++)
//		{
//			a[i] = sc.nextInt();
//		}
//		for(int i = 0;i<n;i++)
//		{
//			c=0;
//			p=i;
//			val = a[i];
//			for(int j = 0;j<n;j++)
//			{
//				if(a[j]==i)
//					c=1;
//			}
//			if(c==1)
//				b[a[i]]=i;
//		}
//		for(int k = 0;k<n;k++)
//		{
//			System.out.print(b[k]+" ");
//		}
    }
}

