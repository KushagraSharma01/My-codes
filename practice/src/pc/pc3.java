package pc;

import java.util.*;
public class pc3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            StringBuilder str3=new StringBuilder();
            str3.append(str);
            StringBuilder str2=new StringBuilder();
            int in=-1;
            for(int i=0;i<str3.length()-3;i++){
                if(str3.charAt(i+3)=='b'||str.charAt(i+3)=='c'||str.charAt(i+3)=='d'){
                    str2.append(str3.substring(i,i+3)+".");
                    i=i+2;
                }
                else{
                	str2.append(str3.substring(i,i+2)+".");
                    i=i+1;
                }
                in=i+1;
            }
            if(str.length()<=3)
            	System.out.println(str);
            else {
            	if(in!=-1)
            		str2.append(str3.substring(in));;
            	System.out.println(str2.toString());
            }
        }
    
}
}