package practice;
import java.util.*;
public class rev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int var1 = 1;
		int star1 = 1;
		int star2 = 1;
		int space1 = n-1;
		int space2 = -1;			// Logical
		while(row<=n)
		{
			int var3 = var1;
			int var2 = 1;
			int i = 1;
			while(i<=space1)
			{
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star1)
			{
				System.out.print(var3+" ");
				j++;
				var3--;
			}
			int k = 1;
			while(k<=space2)
			{
				System.out.print("  ");
				k++;
			}
			if(row==1||row==n)
				star2--;
			int l = 1;
			while(l<=star2)
			{
				System.out.print(var2+" ");
				var2++;
				l++;
			}
			if(row==1||row==n)
				star2++;
			if(row<=n/2)
			{
			space1-=2;
			star1+=1;
			star2+=1;
			space2+=2;
			var1++;
			}
			else
			{
				space1+=2;
				star1-=1;
				space2-=2;
				star2-=1;
				var1--;
			}
			row++;
			System.out.println();
		}
	}

}
