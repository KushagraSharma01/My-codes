package lec4;
import java.util.*;
public class loops6 {
	public static void main(String[] args) {
		//to do Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int row=1;
		
		while(row<=n) {
			int j=1;
			while(j<=row-1) {
				System.out.print(" ");
				j++;
			}
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
		}
			
			System.out.println();
			row++;
			star--;
	}
		sc.close();
}
}