package Assignment;
import java.util.*;
public class Maximum_XOR_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		int max=0;
		for(int i=0;i<a.length;i++) {
			int x=0;
			for(int j=i;j<a.length;j++) {
				x=x^a[j];
				max=Math.max(x, max);
			}
		}
		System.out.println(max);
	}

}
