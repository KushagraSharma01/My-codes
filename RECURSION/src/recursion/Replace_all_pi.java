package recursion;
import java.util.*;
public class Replace_all_pi {

	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String str=sc.next();
            Replace(str,"");
        }
    }
    public static void Replace(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        if(ques.length()>=2 && ques.substring(0,2).equals("pi")){
            Replace(ques.substring(2),ans+3.14);
        }
        else{
            Replace(ques.substring(1),ans+ch);
        }
    }

}
