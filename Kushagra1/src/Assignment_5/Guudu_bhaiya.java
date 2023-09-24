package Assignment_5;
import java.util.*;
public class Guudu_bhaiya {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		String str2=str;
		for(int x=0;x<n;x++) {
			int i=sc.nextInt();
			int j=sc.nextInt();
			int k=sc.nextInt();
			str2=rev(str2,i,j,k);
		}
		System.out.println(str2);
		sc.close();
	}

	public static String rev(String str, int i, int j, int k) {
		char[] arry=new char[str.length()];
		for(int x=0;x<str.length();x++) {
			arry[x]=str.charAt(x);
		}
		for(int y=0;y<k;y++) {
			char a=arry[j-1];
			for(int x=j-1;x>i-1;x--) {
				arry[x]=arry[x-1];
			}
			arry[i-1]=a;
		}
		String str1 = "";
		for(int x=0;x<arry.length;x++) {
			str1=str1+arry[x];
		}
		return str1;
	}
	
}