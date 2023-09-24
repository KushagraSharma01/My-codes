package Assignment_5;
import java.util.*;
public class Alex_on_a_Schedule {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arry=new int[n];
		for(int i=0;i<n;i++) {
			arry[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		int c=0;
		Arrays.sort(arry);
		for(int i=0;i<arry.length-1;i++) {
			for(int j=i+1;j<arry.length;j++) {
				if(arry[j]-arry[i]==d) {
					c++;
				}
			}
		}
		System.out.println(c);
	}

}
