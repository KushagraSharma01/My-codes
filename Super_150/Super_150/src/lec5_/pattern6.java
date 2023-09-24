package lec5_;
import java.util.Scanner;
public class pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space1=0;
		int star=1;
		int space=n-2;
		int star1=1;
		while(row<=n) {
			int l=1;
			while(l<=space1) {
				System.out.print("  ");
				l++;
			}
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star1) {
				if(row!=n/2+1) {
					System.out.print("* ");
					k++;
				}
				else {
					k++;
				}
			}
			if(row<=n/2) {
				space-=2;
				space1++;
			
			}
			else {
				space+=2;
				space1--;
			}
			row++;
			System.out.println();
		}
		sc.close();
	}
}