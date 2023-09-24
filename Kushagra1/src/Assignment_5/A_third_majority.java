package Assignment_5;
import java.util.*;
public class A_third_majority {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arry=new int[n];
		for(int i=0;i<arry.length;i++) {
			arry[i]=sc.nextInt();
		}
		Arrays.sort(arry);
		int c=1;
		for(int i=0;i<arry.length-1;i++) {
			if(arry[i]==arry[i+1]) {
				c++;
			}
			else {
				if(c*1.0f/n>1*1.0f/3) {
					System.out.println(arry[i]);
				}
				c=1;
			}
		}
		if(c*1.0f/n>1*1.0f/3) {
			System.out.println(arry[arry.length-1]);
		}
		sc.close();
	}

}
