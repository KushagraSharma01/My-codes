package assignment1;
import java.util.*;
public class ques33 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("0    ");
        if(n>=1)
        {
		System.out.print("1    ");
		for(int i = 2;i<=n;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(j==2&&i==2);
				else
				{
				 c=a+b;
				 a=b;
				 b=c;
                 if(i>3)
				 System.out.print(c+"   ");
                 else
				 System.out.print(c+"    ");
				}
			}
			System.out.println();
		}
        }
    }
}
