package Assignment_5;

public class Generate_binary_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1??0?101";
		Binarystring(str,"",0);
	}
	public static void Binarystring(String str, String ans,int i) {
		//System.out.println(ans);
		//System.out.println(str);
		if(i==str.length()) {
			System.out.println(ans);
			return;
		}
		if(str.charAt(i)!='?') {
			char ch=str.charAt(i);
			Binarystring(str,ans+ch,i+1);
			return;
		}
		
		Binarystring(str,ans+'0',i+1);
		Binarystring(str,ans+'1',i+1);
	}

}
