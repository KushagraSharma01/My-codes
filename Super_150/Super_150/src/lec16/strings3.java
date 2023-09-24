package lec16;

public class strings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		printsubstring(s);
		
	}
	public static void printsubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
				
			}
		
	}

}
}
