package lec5_;

import java.util.Scanner;

public class pattern4 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int row=0;
			int star=1;
			while(row<n) {
				int i=0;
				int val=1;
				while(i<star) {
					System.out.print(val+" ");
					val=((row-i)*val)/(i+1);
					i++;
				}
				star++;
				System.out.println();
				row++;
			}
			sc.close();
		}
}