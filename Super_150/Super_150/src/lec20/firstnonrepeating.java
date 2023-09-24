package lec20;

public class firstnonrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ADOBCEFODBAC";
		System.out.println(nonrepeat(s));
		
	}
	public static String nonrepeat(String s) {
		int []fs=new int[127];
		int si=0;
		int ei=0;
		int start=-2;
		while(ei<s.length()) {
			char ch=s.charAt(ei);
			fs[ch]++;
			ei++;
		}
		while(si<s.length()) {
			char ch=s.charAt(si);
			if(fs[ch]==1)
				return s.substring(si,si+1);
			si++;
		}
		return "-1";
	}
	
}
