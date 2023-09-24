package recursion;

public class Q_23_letter_combination_of_a_phone_number {
	static String[] key= {"", "abc", "def", "ghi", "jkl", "mno", "pqr", "stuv", "wx", "yz"}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeyPad("123","");
	}
	public static void printKeyPad(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0); //'1'
		String press=key[ch-'0'];	//'abc'
		for(int i=0;i<press.length();i++) {
			printKeyPad(ques.substring(1), ans+ press.charAt(i));
		}		
	}
	
}
