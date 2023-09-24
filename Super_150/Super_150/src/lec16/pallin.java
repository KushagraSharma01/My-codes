package lec16;

public class pallin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="namal";
		System.out.println(pallin(s));
	}
//	public static boolean pallin(String s) {
//		String s1="";
//		for(int i=s.length()-1;i>=0;i--) {
//			s1=s1.concat(s.substring(i,i+1));
//		}
//		if(s1.compareTo(s)==0) {
//			return true;
//		}
//		else
//			return false;
//		
//	}
	public static boolean pallin(String s) {		//Two pointer approach
		int i=0,j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
