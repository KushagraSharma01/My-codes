package assignment1;
import java.util.*;
public class ques11 {
	public static void main(String[] args){
	Scanner sc =  new Scanner(System.in);
	int n = sc.nextInt();
	int copy = n;
	int d,l=0,c=0;
	int sum=0;
	while(copy>0)
	{
		copy=copy/10;
		l++;
	}
	while(n>0)
	{
		c++;
		d=n%10;
		n=n/10;
		if(9-d==0&&c==l)
		{
			sum=sum*10+d;
		}
		else
		{
			if(9-d<d)
			{
			d=9-d;
			sum=sum*10+d;
			}
			else
			{
				sum=sum*10 + d;
			}	
		}

			
	}
	int res=0;
	while(sum>0)
	{
		d=sum%10;
		res=res*10+d;
		sum = sum/10;
	}
	System.out.println(res);
	}
}
