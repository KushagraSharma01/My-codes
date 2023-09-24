package lec_1;

public class Stu_client {

	public static void main(String[] args) {
		stu s = new stu();
		System.out.println(s.age);
		System.out.println(s.name);
		s.age = 90;
		s.name = "Ramu";
		System.out.println(s.age);
		System.out.println(s.name);
		stu s1 = new stu();
		s1.age = 25;
		s1.name = "Vaibhavi";
		System.out.println(s1.age);
		System.out.println(s1.name);
		s.Intro_yourSelf();
		s1.Intro_yourSelf();
		stu s2 = new stu();
		stu s3 = new stu();
		s2.name = "kunal";
		s2.age = 28;
		s3.name = "Hardik";
		s3.age = 26;
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
		System.out.println(".....................");
		Test1(s2, s3);
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
		System.out.println(".....................");
		Test2(s2, s3);
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);
		System.out.println(".....................");
		int my_age = 20;
		String my_name = "C";
		Test3(s2, s3.age, s3.name, my_age, my_name);
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s3.name + " " + s3.age);

	}

	public static void Test3(stu s2, int age, String name, int myAge, String myName) {
		s2.age = 0;
		s2.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}
	public static void Test2(stu s2, stu s3) {
		s2 = new stu();
		int tempa = s2.age;
		s2.age = s3.age;
		s3.age = tempa;
		s3 = new stu();
		String tempn = s2.name;
		s2.name = s3.name;
		s3.name = tempn;
	}
	public static void Test1(stu s2, stu s3) {
		stu t = s2;
		s2 = s3;
		s3 = t;
	}
}
