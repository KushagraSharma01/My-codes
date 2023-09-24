package recursion;

public class Q_10_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		PrintSubSeq(str,"");
		
	}
	private static void PrintSubSeq(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(0);
		PrintSubSeq(str.substring(1),ans);
		PrintSubSeq(str.substring(1),ans+ch);
	}
	
}