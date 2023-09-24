package practice;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n/2;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=2*star-1) {
				if(k%2==1)
					System.out.print("* ");
				else
					System.out.print("? ");
				k++;
			}
			System.out.println();
			if(row<=n/2) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			row++;
		}
	}

}
