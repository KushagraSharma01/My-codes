package pc;
import java.util.*;
public class pcp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int [][]a=new int[n][n];
			for(int i=0;i<n;i++) {
				String str=sc.next();
				for(int j=0;j<str.length();j++)
					a[i][j]=str.charAt(j)-'0';
			}
//			System.out.println("hello");
			int ca=1;
			for(int i=0;i<n;i++) {
				int ones=0;
				int col=-1;
				for(int j=0;j<n;j++) {
					if(a[i][j]==1) {
						ones++;
						col=j;
					}
				}
				if(ones==1) {
					
					int prev=1;
					for(int j=i+1;j<n;j++) {
						int c1=0;
						int c2=0;
						for(int k=col+1;k<n;k++) {
							if(a[j][k]==1)
								c1++;
						}
						for(int k=col-1;k>=0;k--) {
							if(a[j][k]==1)
								c2++;
						}
						if(c1+c2==0)
							break;
						if(c1==c2&&c1+c2+1==prev+2) {
							ca=-1;
							prev=c1+c2+1;
						}
						else {
							ca=1;
							break;
						}
					}
					break;		
				}
			}
			if(ca==-1) {
				System.out.println("TRIANGLE");
				continue;
			}
			else {
			for(int i=0;i<n;i++) {
				int ones=0;
				int col=-1;
				for(int j=0;j<n;j++) {
					if(a[i][j]==1) {
						ones++;
						col=j;
					}
				}
				if(ones==1) {
					
					int prev=1;
					for(int j=i-1;j>=0;j--) {
						int c1=0;
						int c2=0;
						for(int k=col+1;k<n;k++) {
							if(a[j][k]==1)
								c1++;
						}
						for(int k=col-1;k>=0;k--) {
							if(a[j][k]==1)
								c2++;
						}
						if(c1+c2==0)
							break;
						if(c1==c2&&c1+c2+1==prev+2) {
							ca=-1;
							prev=c1+c2+1;
						}
						else {
							ca=1;
							break;
						}
					}
					break;		
				}
			}
			}
			if(ca==-1) {
				System.out.println("TRIANGLE");
				continue;
			}
			else {
				for(int i=0;i<n;i++) {
					int ones=0;
					int cols=-1;
					int cole=-1;
					for(int j=0;j<n;j++) {
						if(a[i][j]==1) {
							ones++;
							if(cols==-1)
							cols=j;
							cole=j;
						}
					}
					if(ones!=0) {
						int prev=ones;
						for(int j=i;j<=i+ones-1;j++) {
							int c1=0;
							for(int k=cols;k<=cole;k++) {
								if(a[j][k]==1)
									c1++;
							}
							if(c1==prev) {
								ca=-1;
							}
							else {
								ca=1;
								break;
							}
						}
						break;		
					}
				}
			}
			if(ca==-1) {
				System.out.println("SQUARE");
				continue;
			}
			else
				System.out.println();
		}
	}

}
