package recursion;

public class Q_30_string_breakdown {

	public static void main(String[] args) {
		String Ques="nitin";
		String ans="";
		Partitioning(Ques,ans);
	}
	public static void Partitioning(String Ques, String ans) {
		if(Ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=Ques.length();i++) {
			String part=Ques.substring(0,i);
			Partitioning(Ques.substring(i),ans+part+"|");	
		}
	}
}
