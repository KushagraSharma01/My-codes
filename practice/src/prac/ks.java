package prac;
import java.util.*;
public class ks {
	static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c=0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		path(0,0,n,m,"");
		System.out.println();
		System.out.println(c);
		
	}
	public static void path(int i,int j, int n, int m,String ans) {
		if(i>=n||j>=m)
			return;
		if(i==n-1&&j==m-1) {
			System.out.print(ans+" ");
			c++;
			return;
		}
		path(i+1,j,n,m,ans+"V");
		path(i,j+1,n,m,ans+"H");
		path(i+1,j+1,n,m,ans+"D");
	}

}
