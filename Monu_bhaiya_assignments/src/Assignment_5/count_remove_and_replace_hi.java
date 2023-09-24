package Assignment_5;

public class count_remove_and_replace_hi {
	static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abchihibi";
		hii(str,"","");
	}
	public static void hii(String str, String answithout, String answith) {
		if(str.length()==0) {
			System.out.println(c);
			System.out.println(answithout);
			System.out.println(answith);
			return;
		}
		char ch=str.charAt(0);
		if(str.length()>=2 && str.substring(0,2).equals("hi")) {
			c++;
			hii(str.substring(2),answithout,answith+"bye");
		}
		else {
			hii(str.substring(1),answithout+ch,answith+ch);
		}
	}
}
