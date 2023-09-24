package problems;

public class q151reverse_string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=" the sky   is blue ";
		System.out.println(reverseWords(str1));		//trim function removes the spaces from starting and ending of a string
		
	}
	public static String reverseWords(String s) {
		s=s.trim();
		String []arr = s.split("\s+");			//to split from spaces even for more than one spaces(\s+)
		String ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans=ans+arr[i]+" ";
		}
        return ans.trim();
    }
}
