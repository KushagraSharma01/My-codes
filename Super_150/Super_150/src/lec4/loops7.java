package lec4;
import java.util.*;
public class loops7 {
	public static void main(String[] args) {
		//to do Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int j=1;
			while(j<=n-row) {
				System.out.print(" ");
				j++;
			}
			int i=1;
			while(i<=2*star-1) {
				if(i%2==0) {
					System.out.print("_");
				}
				else {
					System.out.print("*");
				}
				i++;
		}
			
			System.out.println();
			row++;
			star++;
	}
		sc.close();
}
}