package oops2_lec1;

public interface Stack_Interface extends Dynamic_stack_interface,Data_Str{//A
	public void push(int item);
	public int pop();
	public int peek();
	
	//int x; //no object is created so no value is assigned
	public static final int x=9;	//int x=9;
	
	default void fun() {
		
	}
	public static int fun1() {
		return 0;
	}
	private static int fun2() {
		return 0;
	}
}
//we can give body in interface(in java8)
//in normal class by default access identifier is default
//but in interface it public by default
//interface is abstract by default
//when a class uses interface then we will use implements keyword
//if there is final keyword before a method then it cannot be override
//if there is final keyword before a class then it cannot be inherited
//final before variable hides it from other classes
//default is used to access inside package