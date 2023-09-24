package Assignment_5;
import java.util.*;
import java.util.ArrayList;
public class Monu_bhaiya_going_to_shimla {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		String n=sc.next();
		int[] arry=new int[127];
		for(int i=0;i<n.length();i++) {
			char ch=n.charAt(i);
			arry[ch]++;
		}
		int[] arry1=new int[127];
		for(int i=0;i<127;i++) {
			arry1[i]=arry[i];
		}
		int c=0;
		for(int i=0;i<m.length();i++) {
			char chh=m.charAt(i);
			if(arry1[chh]!=0) {
				arry1[chh]--;
				c++;
				if(c==3) {
					list.add(i-n.length()+1);
					for(int j=0;j<127;j++) {
						arry1[j]=arry[j];
					}
					c=0;
				}
			}
			else {
				for(int j=0;j<127;j++) {
					arry1[j]=arry[j];
				}
				c=0;
				if(arry[chh]!=0) {
					c++;
					arry1[chh]--;
				}
			}
		}
		System.out.println(list);
	}

}
