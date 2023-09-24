package lec21;

public class vyom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the hello the";//"a ab abd abd abcd aefg afighk";
		int[] arry=new int[27];
		str=str.toLowerCase();
		int c=0;
		int max=0;
		int si=0;
		int ei=0;
		int c1=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str.charAt(i)==' ') {
				if(c>max && c1==c) {
					ei=i;
					si=ei-c;
					max=c;
				}
				c=0;
				c1=0;
			}
			else if(i==str.length()-1){
				c++;
				c1++;
				if(c>max && c1==c) {
					ei=i+1;
					si=ei-c;
					max=c;
				}
			}
			else {
				c++;
				if(arry[ch-97]>0) {
					c1++;	
				}
				if(str.charAt(i)==' ') {
					arry[26]++;
				}
				else {
					arry[ch-97]++;
				}
			}
		}
		System.out.println(max);
		System.out.println(str.substring(si,ei));
	}

}
