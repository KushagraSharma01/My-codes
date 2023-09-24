package lec4;
import java.util.*;
public class loops2 {
	public static void main(String[] args) {
		//to do Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		
		while(row<=star) {
			int i=1;
			while(i<=row) {
				System.out.print("* ");
				i++;
		}
			System.out.println();
			row++;
	}
		sc.close();
}
}
