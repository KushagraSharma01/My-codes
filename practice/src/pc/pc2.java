package pc;

import java.util.*;
public class pc2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			String str = sc.next();
			int c = 1;
			int z=0;
			for(int i=1;i<str.length();i++) {
				
				if(str.charAt(i)!=str.charAt(i-1))
					c++;
				if(str.charAt(i)=='1' &&str.charAt(i-1)=='0'&&z==0) {
					z++;
					c--;
				}
			}
			System.out.println(c);
		}
	}

}


//import java.util.*;
//public class Main {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0){
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(a<=b)
//		    System.out.print(a+" "+b);
//		else
//		    System.out.print(b+" "+a);
//		System.out.println();
//		}
//	}
//
//}
