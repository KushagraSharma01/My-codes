package assignment1;
import java.util.*;
public class ques22 {
	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		
		int space=2*n-1;
		int row=1;
		while(row<=2*n+1) {
			int j=0;
			while(j<star) {
				System.out.print(n-j);
				j++;
			}
			
			int k=1;
			while(k<=space) {
				System.out.print(" ");
				k++;
			}
			k=1;
			if(row==n+1) {
				k=2;
			}
			int a=n-j+1;
			if(row==n+1) {
				a=1;
			}
			while(k<=star) {
				System.out.print(a);
				k++;
				a++;
			}
			System.out.println();
			if(row<n+1) {
				space-=2;
				star++;
			}
			else {
				space+=2;
				star--;
			}
			row++;
		}
		}
}