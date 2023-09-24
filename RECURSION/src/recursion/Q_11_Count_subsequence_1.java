package recursion;

public class Q_11_Count_subsequence_1 {
	static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		CountSubSeq(str,"");
		System.out.println(c);
	}

	public static void CountSubSeq(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			//System.out.print(ans+" ");
			c++;
			return;
		}
		char ch=str.charAt(0);
		CountSubSeq(str.substring(1),ans);
		CountSubSeq(str.substring(1),ans+ch);
	}
}
