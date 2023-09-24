package problems;

public class Q_125_valid_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		String str="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                str=str+s.charAt(i);
            }
        }
        str=str.toLowerCase();
        System.out.println(str);
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                break;
            }
        }
        if(i>=j){
            System.out.println("true");
        }
        else{
            System.out.println(false);
        }
	}

}
