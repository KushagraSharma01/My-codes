package recursion;

public class Q_38_combination_abcd_of_two_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		String str="abcd";
		Permutation(n,str,"");
	}
	public static void Permutation(int n, String ques, String ans) {
		if(ans.length()==n) {
			System.out.println(ans);
			return;
		}
		if(ques.length()==0) {
			return;
		}
		char ch=ques.charAt(0);
		Permutation(n,ques.substring(1),ans+ch);
		Permutation(n,ques.substring(1),ans+"");
	}
}
