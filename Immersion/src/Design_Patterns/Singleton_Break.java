package Design_Patterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton_Break {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, Exception {
		
		Student s = Student.GetInstance();	
		
		//Reflection Api can access the private constructor of a class
		//Student.class to load class
		
		Constructor<Student> ct = Student.class.getDeclaredConstructor(); 		//getting the constructor of that class
		
		ct.setAccessible(true);			//made the private constructor accessible(public) 
		
		Student s1 = ct.newInstance();		//creating an instance using that constructor
		
		System.out.println(s);
		System.out.println(s1);
	}
	
}
