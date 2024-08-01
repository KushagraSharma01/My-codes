package CF;
import java.util.*;
public class div3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
		
			int in=sc.nextInt();
			int ex=sc.nextInt();
			int un=sc.nextInt();
			
			int c=in;
			c+=ex/3;
			if((ex%3!=0&&un==0)||(ex%3==1&&un==1))
				System.out.println("-1");
			else if(((ex%3)+un)%3==0) {
				c+=((ex%3)+un)/3;
				System.out.println(c);
			}
			else {
				c+=(((ex%3)+un)/3 )+1;
				System.out.println(c);
			}
				
		}
		
	}

}
