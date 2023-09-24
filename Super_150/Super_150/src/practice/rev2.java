package practice;
import java.util.*;
public class rev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space1=n-1;
		int space2=-1;
		int var1=1;
		int row=1;
		while(row<=n) {
			int k=1;
			while(k<=space1) {
				System.out.print(" ");
				k++;
			}
			int j=1;
			int a=var1;
			while(j<=star) {
				System.out.print(a);
				a--;
				j++;
			}
			if((row>1) && (row<n)) {
				k=1;
				while(k<=space2) {
					System.out.print(" ");
					k++;
				}
				k=1;
				a=1;
				while(k<=star) {
					System.out.print(a);
					a++;
					k++;
				}
			}
			System.out.println();
			if(row<n/2+1) {
				star++;
				space1-=2;
				space2+=2;
				var1++;
			}
			else if(row>=n/2+1) {
				star--;
				space1+=2;
				space2-=2;
				var1--;
			}
			row++;
		}
	}

}
