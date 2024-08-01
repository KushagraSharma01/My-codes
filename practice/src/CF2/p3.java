package CF2;
import java.util.*;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			String ans = "";
			String ans2 = "";
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==':') {
					int n = Integer.valueOf(ans);
					ans="";
					for(int j=i+1;j<str.length();j++) {
						ans+=str.charAt(j);
					}
					int n2 = Integer.valueOf(ans);
					if(n>=12) {
						if(n==12 && n2>=10) 
							ans2+="12"+":"+n2+" "+"PM";
						else if(n==12 && n2<10) 
							ans2+="12"+":0"+n2+" "+"PM";
						else if(n%12<10&&n2>10)
							ans2+="0"+n%12+":"+n2+" "+"PM";
						else if(n%12<10&&n2<10)
							ans2+="0"+n%12+":0"+n2+" "+"PM";
						else if(n%12>=10&&n2<10)
							ans2+=n%12+":0"+n2+" "+"PM";
						else
							ans2+=n%12+":"+n2+" "+"PM";
					}
					else {
						if(n==0 && n2>=10 ) 
							ans2+="12"+":"+n2+" "+"AM";
						else if(n==0 && n2<10) 
							ans2+="12"+":0"+n2+" "+"AM";
						else if(n<10&&n2>10)
							ans2+="0"+n%12+":"+n2+" "+"AM";
						else if(n<10&&n2<10)
							ans2+="0"+n%12+":0"+n2+" "+"AM";
						else if(n>=10&&n2<10)
							ans2+=n%12+":0"+n2+" "+"AM";
						else
							ans2+=n%12+":"+n2+" "+"AM";
					}
					System.out.println(ans2);
					break;
				}
				ans+=str.charAt(i);
			}
		}
	}

}
