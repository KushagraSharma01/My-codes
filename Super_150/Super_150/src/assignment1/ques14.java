package assignment1;
import java.util.*;
public class ques14 {
	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//    int n1=sc.nextInt();
//    int n2=sc.nextInt();
//    int i=1;
//    int c=1;
//    int j=1;
//    while(i<=n1){
//        while(1==1){
//        if((3*j+2)%n2!=0){
//            break;
//        }j++;
//        }
//        int t=3*j+2;
//        System.out.println(t);
//        i++;
//        j++;
//    }
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int c = 0;
		int i = 1;
		while(c!=n1)
		{
			if((3*i+2)%n2!=0)
			{
				c++;
				System.out.println((3*i+2));
			}
			i++;
		}
}
}