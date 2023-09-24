package lec16;

public class bootstring {
	public static void main(String[] args) {
		String s="cbaeicde";
		int c=0,max=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				c++;
				max=Math.max(max,c);
			}
			else
				c=0;
		}
		System.out.println(max);
	}

}
