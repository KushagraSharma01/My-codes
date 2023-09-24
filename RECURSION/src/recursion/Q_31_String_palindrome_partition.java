package recursion;
import java.util.*;
public class Q_31_String_palindrome_partition {

	public static void main(String[] args) {
		String Ques="nitin";
		List<String> ll=new ArrayList<>();
		List<List<String>> ans=new ArrayList<>();
		Partitioning(Ques,ll,ans);
		System.out.println(ans);
	}
	public static void Partitioning(String Ques,List<String>ll,List<List<String>> ans) {
		if(Ques.length()==0) {
			//System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=1;i<=Ques.length();i++) {
			String part=Ques.substring(0,i);
			if(ispalindrome(part)) {
				ll.add(part);
				Partitioning(Ques.substring(i),ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
	public static boolean ispalindrome(String part) {
		int i=0;
		int j=part.length()-1;
		while(i<=j) {
			if(part.charAt(i)!=part.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}
