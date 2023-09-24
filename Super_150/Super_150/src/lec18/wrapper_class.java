package lec18;

public class wrapper_class {
	public static void main(String[] args) {
		// for every primitive datatype there is a corresponding Non-Primitive datatype which comes in wrapper class
		// non-primitive datatypes such as strings,array,etc.
		// primitive datatypes such as int,float,etc.
		
		Integer a=10;			//	
		int a1=10;
		System.out.println(a);		// a have the address but value at the address will be printed 
		System.out.println(a1);		// a1 is having a content not address
		
		a=a1;						//primitive is converted into non-primitve is called Autoboxing.
		int b=-6;
		Integer b1=-9009;
		b=b1;						// non-primitive is converted into primitive is called Unboxing.
		
		Integer c1=10;				// **In comparison of Non-primitive datatypes addresses are compared not the value
		Integer c2=10;				//Both c1 and c2 comes in the range of cache(-128 to 127) so there address will be same
		Integer c3=178;				//Both c3 and c4 comes out of the range of cache so there addresses will be different 
		Integer c4=178;
		System.out.println(c1==c2);
		System.out.println(c3==c4);
	}
}
