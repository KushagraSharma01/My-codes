package lec8;

public class functions3 {
	static int val=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a=7;
		int b=9;
		System.out.println(addition(a,b));
		System.out.println(val);	//calling the global variable
	}
	public static int addition(int a1,int b1) {
		int c=a1+b1;
		int val=90;
		functions3.val=val+5;  		//function name is used to call global variable
		return c;
	}
}
