package lec_1;

public class Student2 {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name="raju";
		s.age=16;
		s.Intro_yourSelf();
		Student s1=new Student();
		s1.name="Kamlesh";
		s1.age=18;
		s1.Intro_yourSelf();
		s1.SayHey("Raju");
	}
}
