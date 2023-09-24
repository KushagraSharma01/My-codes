package hack;

public class Width_of_a_column {

	public static void main(String[] args) {
		String word="bbcc";
		int ans=0;
		for(int i=0;i<word.length();i++) {
			int c=0;
			if(i<word.length()-2 && word.substring(i,i+3).equals("abc")){
				c=c+0;
				i=i+2;
			}
			else if(i<word.length()-1 && (word.substring(i,i+2).equals("ab") || word.substring(i,i+2).equals("bc") || word.substring(i,i+2).equals("ac")))
			{
				c=c+1;
				i=i+1;
			}
			else {
				c=c+2;
			}
			ans=ans+c;
			System.out.println(c);
		}
		System.out.println(ans);
	}

}
