package lec16;

public class strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelloHey";
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(1,1));
		// kunal > komal lexiographically 
		String s1="kunal";
		String s2="komal";
		System.out.println(s1.compareTo(s2)); 		//returns positive value if s1>s2 which is the difference between the unequal characters 
													//and negative value if s1 < s2 and 
													//returns 0 if both are equal.
	}
	
	public static int comparesToo(String s1, String s2) {
		int i=0;	//s1
		int j=0;	//s2
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				return s1.charAt(i)-s2.charAt(j);
			}
			i++;
			j++;
		}
		return s1.length()-s2.length();
	}
}
