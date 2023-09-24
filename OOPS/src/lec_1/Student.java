package lec_1;

public class Student {

	String name;
	int age;
	
	public void Intro_yourSelf() {
		System.out.println("My name is "+ this.name + " and age is "+ this.age);
	}
	public void SayHey(String name) {
		System.out.println(name+" say hii to "+ this.name);
	}
}