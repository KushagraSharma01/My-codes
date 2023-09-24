package lec_2;
public class Student {

	private String name="kirti";		//by adding priveate we can access these variables only in same class(person class only)		
	
	private int age=21;
	public Student(String name,int age) {
		this.age=age;
		this.name=name;
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
	//public void setAge(int age) throws Exception{
//		if(age<0){
//			System.out.println("age can't be negative");
//			return;
//		}
		//if(age<0) {
			//throw new Exception("baklol age -ive nhi hota");
		//}
		
		
		//this.age = age;
	//}
	public void setAge(int age){
		try {							//We do not import exception class in starting because it is present in java.lang package. we do not need to import it....
		if(age<0) {
			throw new Exception("baklol age -ive nhi hota");
		}
		}
		catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("hii this side Kushagra Gupta");
		}
		this.age = age;
	}
}
