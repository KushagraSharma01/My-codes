package lec_3;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CASE-1
		//P obj=new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		
		
		
		// CASE-2
//		P obj =new C();  			//(obj P type ka hai to sirf p wale ko client class dekh skta hai)
//		System.out.println(obj.d);		// In Compile Time(P)
//		System.out.println(obj.d1);		
//		System.out.println(((C)(obj)).d2);			// In Run time(C)
//		System.out.println(((C)(obj)).d);
//		
//		
//		//Method overriding
//		obj.fun();	//check blue print of those class which is write in new(new C)			
//		obj.fun1();
//		((C)(obj)).fun2();			//we use type casting because we can't see C in compile time but we can see it in run time
		
		
		
		
		//CASE-3
		//C obj=new P();			
		//Inheritance do not allow in this case
//		System.out.println(obj.d);
//		System.out.println(obj.d1);			//dono class(p aur C) access ho rhi hai
//		System.out.println(obj.d2);
//		obj.fun();
//		obj.fun1();
//		obj.fun2();
		
		
		//CASE-4
//		C obj=new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
//		System.out.println(((P)obj).d);
//		obj.fun();
//		obj.fun1();
//		obj.fun2();
		//Multilevel and multiple inheritance is not allowed in java
	}

}
