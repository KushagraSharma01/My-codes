package lec_2;

public class person {
//	String name;
//	int age;
//	
//	public person() {			//Constructor(it is also a function which is used to initialize the value of a data member of a class.It runs first in the program)
//		this.name="panchi";			(DATA HIDING)
//		this.age=25;
//	}
	
	
	
	//private String name="kirti";		//by adding priveate we can access these variables only in same class(person class only)		
										
	//private int age=21;

	
	
	String name="kirti";
	int age=21;				// first memory Allocation(null,0) then passing then constructor
	
	//	public person() {				//Default constructor
//									//defaultly constructor gives a value of name is null and age is 0.....
//	}
	public person(String name,int age) {			//Constructor(it is also a function which is used to initialize the value of a data member of a class.It runs first in the program)
		this.name=name;      	//defaultly it changes the the value to initialized vale and constructor gives a value of name is kunal and age is 24.....
		this.age=age;
	}
	public person(String name) {
		this.name=name;
	}
	public void fun() {
		int Aadhar_no=901928;
		System.out.println(this.name+" "+this.age+" "+ Aadhar_no);
	}
	
	
	
	public void SetName(String name) {
		this.name=name;
	}
	public void SetAge0(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
