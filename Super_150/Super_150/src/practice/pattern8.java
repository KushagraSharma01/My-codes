package practice;
import java.util.*;
public class pattern8{
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space1=0;
		int space2=n-2;
		while(row<=n) {
		if(row!=(n/2)+1) {
			int j=0;
			while(j<space1) {
				System.out.print(" ");
				j++;
			}
			System.out.print("*");
			int i=1;
			while(i<=space2) {
				System.out.print(" ");
				i++;
			}
			System.out.print("*");
			System.out.println();
		}
		else {
			int k=1;
			while(k<=n/2) {
				System.out.print(" ");
				k++;
			}
			System.out.print("*");;
			System.out.println();
		}
		if(row<=n/2) {
			space1++;
			space2-=2;
		}
		else {
			space1--;
			space2+=2;
		}
		row++;
	}sc.close();
		}
}

