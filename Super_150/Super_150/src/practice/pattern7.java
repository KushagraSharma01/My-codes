package practice;
import java.util.*;
public class pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n;
		while(row<=n) {
			if(row==1 || row==n) {
				int i=1;
				while(i<=n) {
					System.out.print("* ");
					i++;
				}
				System.out.println();
			}
			else {
				int j=1;
				while(j<=n) {
				if(j==1||j==n) {
					System.out.print("* ");
					j++;
				}
				else {
					while(j<space) {
						System.out.print("  ");
						j++;
					}
				}
				}
				System.out.println();
			}
			row++;
		}	
		sc.close();
	}
}
