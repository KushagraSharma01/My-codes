package lec21;
import java.util.*;
public class hack {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        String str=sc.next();
        int len=str.length();
        if(len<8 || len>30){
        	
            System.out.println("Invalid");
            continue;
        }
        char ch=str.charAt(0);
        if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z')){
        
        }
        else{
        	
            System.out.println("Invalid");
            continue;
        }
        int c=0;
        for(int j=1;j<str.length();j++){
            char ch1=str.charAt(j);
            if((ch1=='_')||(ch1>='0' && ch1<='9') || (ch1>='A' && ch1<='Z') || (ch1>='a' && ch1<='z') ){
            }
            else{
                System.out.println("Invalid");
                c++;
                continue;
            }
        }
        if(c==0){
            System.out.println("Valid");
        }
        }
	}

}