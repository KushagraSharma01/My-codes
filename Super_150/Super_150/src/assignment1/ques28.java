package assignment1;
import java.util.*;
public class ques28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n+1;
		int row=1;
		while(row<=n) {
			int j=1;
			int num=1;
			while(j<=star) {
				System.out.print(num+" ");
				num++;
				j++;
			}
			j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			j=1;
			num=num-1;
			if(row==n) {
				star=star-1;
				num=num-1;
			}
			while(j<=star) {
				System.out.print(num+" ");
				num--;
				j++;
			}
			System.out.println();
			row++;
			star++;
			space-=2;
		}
	}
}
