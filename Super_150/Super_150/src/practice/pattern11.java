package practice;
import java.util.*;
public class pattern11 {
	public static void main( String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-2;
		int space1=1;
		int star=2;
		int star1=2;
		while(row<=n) {
			if(row==1 || row==n) {
				int i=1;
				while(i<=n) {
					System.out.print(" ");
					i++;
				}
				System.out.println("*");
			}
			else{
				int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("*");
				j++;
			}
			int k=1;
			while(k<=space1) {
				System.out.print(" ");
				k++;
			}
			int l=1;
			while(l<=star1) {
				System.out.print("*");
				l++;
			}
			System.out.println();
			if(row<n/2+1) {
				space-=2;
				star++;
				space1+=2;
				star1++;
			}
			else {
				space+=2;
				star--;
				space1-=2;
				star1--;
			}
			
		}row++;
			}
	}
}
