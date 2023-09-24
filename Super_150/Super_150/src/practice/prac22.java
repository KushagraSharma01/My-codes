package practice;
import java.util.*;
public class prac22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space1=(n/2);
		int space2=1;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=space1) {
				System.out.print(" ");
				j++;
			}
			if(row==1||row==n) {
				System.out.println("*");
			}
			else {
				System.out.print("*");
				j=1;
				while(j<=space2) {
					System.out.print(" "); 
					j++;
				}
				System.out.println("*");
				if(row<n/2+1) {
					space2+=2;
				}
				else {
					space2-=2;
				}
			}
			if(row<(n/2)+1) {
				space1--;
			}
			else {
				space1++;
			}
			row++;
		}
		
	}
}

