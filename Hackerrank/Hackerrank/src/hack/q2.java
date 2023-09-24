package hack;
import java.util.*;
public class q2 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int j=0;j<3;j++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.print(s1);
            int l=15-s1.length();
            int i=1;
            while(i<=l){
            System.out.print(" ");
            i++;
            }
            if(x>=100){
                System.out.println(x);
            }
            else if(x>=10){
                System.out.println("0"+x);
            }
            else if(x<10){
                System.out.println("00"+x);
            }
            
        }
        System.out.println("================================");

}
}
