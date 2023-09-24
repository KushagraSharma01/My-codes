package practice;

public class lengthoflastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("hello world"));
	}
	public static int lengthOfLastWord(String s) {
        int s1=0;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                s1++;
                break;
            }
        }
        System.out.println(s1);
        if(s1==0)
            return s.length();
        else{
            s=s.substring(i,s.length()-1);
            return s.length();
        }
    }

}
