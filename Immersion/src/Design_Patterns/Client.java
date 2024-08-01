package Design_Patterns;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = Student.GetInstance();
		Student s2 = Student.GetInstance(); //same as above
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
