package lec_3;

public class C extends P{
	int d=2;
	int d2=20;
	@Override		//same name function in child class or parent class then function is override
	public void fun() {
		System.out.println("fun in c");
	}
	public void fun2() {
		System.out.println("fun2 in c");
	}
}
