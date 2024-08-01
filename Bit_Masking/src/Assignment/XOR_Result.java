package Assignment;
import java.util.*; 
public class XOR_Result {
	
	public static void main(String[] args) {
		int x=0;
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int st=sc.nextInt();
		for(int i=0;i<n;i++) 
			x=x^2*i;
		System.out.println(x);
	}
}
