package lec_1;

public class stu {
	String name;
	int age;

	public void Intro_yourSelf() {
		String name = "Kaju";
		int age=20;
		System.out.println("My Name is " + name + " and age is " + age);
		System.out.println("My Name is " + this.name + " and age is " + this.age);
		System.out.println("............................");
	}
}
