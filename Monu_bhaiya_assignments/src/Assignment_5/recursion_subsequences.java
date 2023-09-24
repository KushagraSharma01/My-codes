package Assignment_5;

public class recursion_subsequences {
	static int c=0;
	public static void main(String[] args) {	
		String str="abcd";
		subseq(str,"");
		System.out.println("\n"+c);
	}

	public static void subseq(String ques, String ans) {
		if(ques.length()==0){
			System.out.print(ans+" ");
			c++;
			return;
		}
		char ch=ques.charAt(0);
		subseq(ques.substring(1),ans);
		subseq(ques.substring(1),ans+ch);
	}
	

}
