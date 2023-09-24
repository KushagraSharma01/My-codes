package recursion;

public class Q_12_Count_subsequence_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		PrintSubSeq(str,"");
		System.out.println("\n"+CountSubSeq(str,""));	
	}

	public static void PrintSubSeq(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=str.charAt(0);
		PrintSubSeq(str.substring(1),ans);
		PrintSubSeq(str.substring(1),ans+ch);
	}
	public static int CountSubSeq(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			//System.out.print(ans+" ");
			return 1;
		}
		char ch=str.charAt(0);
		int a=CountSubSeq(str.substring(1),ans);
		int b=CountSubSeq(str.substring(1),ans+ch);
		return a+b;
	}
	
	
}
