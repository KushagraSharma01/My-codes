package CF2;
import java.util.*;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			if(n==1) {
				System.out.println("##");
				System.out.println("##");
			}
			else {
				int c=0;
				for(int i=0;i<2*n;i++) {
					c=0;
					if(i%4<2) {
						for(int j=0;j<2*n;j++) {
							if(c%4<2)
								System.out.print("#");
							else
								System.out.print(".");
							c++;
						}
					}
					else {
						for(int j=0;j<2*n;j++) {
							if(c%4<2)
								System.out.print(".");
							else
								System.out.print("#");
							c++;
						}
					}
					System.out.println();
				}
			}
		}
	}

}
