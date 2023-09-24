package lec16;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		String  str1="Hello";
		String str2=new String("Hello");
		String str3=new String("Hello");
		System.out.println(str);       		//Hello
		System.out.println(str==str3);		//false       (address is compared not content)..
		System.out.println(str==str1);		//true			(for comparing content use string method .equals()...)
		System.out.println(str2==str3);		//false
		System.out.println(str.equals(str3));    //true
		String s=str+str3;
		System.out.println(s);
		
		String s1=str+"bye";
		String s2=str+"bye";
		System.out.println(s1==s2);				//it is formed in heap so it gives false(variable+literal)(variable+variable)(literal+variable)
		
		String s3="Hello"+"Bye";
		String s4="Hello"+"Bye";
		System.out.println(s3==s4);				//it is formed in pool so it gives true(literal+literal)
		System.out.println(s+18+90);			//HelloHello7890
		System.out.println(s+(18+90));			//HelloHello168
		System.out.println(18+90+s);  			//108HelloHello
	}

}
