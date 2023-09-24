package assignment1;
import java.util.Scanner;
public class ques17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int sum = 0,sum2=0,d,d2,p,flag=0;
		while(num>0)
		{
			d=num%10;
			sum+=d;
			num=num/10;
		}
		int i = 2;
		while(n!=1)
		{
			if(n%i==0)
			{
				n=n/i;
				i=i;
				for(int j = 2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					p=i;
					while(p>0)
					{
						d2=p%10;
						sum2+=d2;
						p=p/10;
					}
				}
				else
					break;
			}
			else
				i++;
		}
		if(flag==0)
		{
			if(sum==sum2)
			{
				System.out.println("1");
			}
			else
				System.out.println("0");
		}
		else
			System.out.println("0");
//		Scanner sc=new Scanner(System.in);
//		long n=sc.nextLong();
//		long i=2;
//		long s1=0;
//		long s2=0;
//		long b=n;
//		while(b>0) {
//			long r=b%10;
//			s2=s2+r;
//			b=b/10;
//		}
//		while(i<n) {
//			if(n%i==0) {
//				long j=2;
//				int c=0;
//				while(j<i) {
//					if(i%j==0) {
//						c++;
//					}
//					j++;
//				}
//				if(c==0) {
//					int d=0;
//					long a=n;
//					while(a>0) {
//						if(a%i==0) {
//							d++;
//						}
//						else {
//							break;
//						}
//						a=a/i;
//					}if(i<=9) {
//					int k=1;
//					while(k<=d) {
//						s1=s1+i;
//						k++;
//					}
//					}
//					else {
//						int l=1;
//						while(l<=d) {
//							long e=i;
//							while(e>0) {
//								long r=e%10;
//								s1=s1+r;
//								e=e/10;
//							}l++;
//						}
//					}
//				}
//			}
//			i++;
//		}
//		if(s1==s2) {
//			System.out.println("1");
//		}
//		else {
//			System.out.println("0");
//		}
//		System.out.println(s1);
	}
}
