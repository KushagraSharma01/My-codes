package assignment1;
import java.util.*;
public class ques25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int num1=1;
		int num2=2;
		int space=n-1;
		while(row<=n) {
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(num1+" ");
				num1++;
				j++;
			}
			num1=row+1;
			if(row>1) {
				j=1;
				int num3=num2;
				while(j<star) {
					System.out.print(num3+" ");
					num3--;
					j++;
				}
			}
			System.out.println();
			if(row>1) {num2+=2;}
			row++;
			star++;
			space--;
			
		}
	}
}
