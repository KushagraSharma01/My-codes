package Design_Patterns;

//Singleton Pattern
public class Student {
	
	String name= "Kaju";
	int age = 20;
	
	//Single object will be accessed every time
	
	//#Eager initialization (when no object is required but still we make it)
	
//	static Student s = new Student();
//	
//	private Student() {
//		
//	}
//	
//	public static Student GetInstance() {
//		return s;
//	}
	
	//#Lazy
	
//	static Student s;
//	
//	private Student() {
//		
//	}
//	
//	public static Student GetInstance() {
//		
//		//What if more than one thread(Process tries to GetInstance at same time then two or more objects will be created
//		//Not synchronized
//		
//		if(s == null) {
//			s = new Student();
//		}
//		
//		return s;
//	}
	
	//#synchronized method
	
//	static Student s;
//	
//	private Student() {
//		
//	}
//	
//	synchronized public static Student GetInstance() { //complete method is synchronized(but we only needed to synchronize the
//													   //if block)
//		if(s == null) {
//			s = new Student();
//		}
//		
//		return s;
//	}
	
	//#Double Locking
	
//	static Student s;
//	
//	private Student() {
//		
//	}
//	
//	public static Student GetInstance() { //only a block is synchronized
//		
//		synchronized (Student.class) {	//code before this block and after it will work concurrently for different threads
//			if(s == null) {
//				s = new Student();		//problem of memory loss will occur
//			}
//		}								//this will still create more than 1 object due to no fast change in Main Memory
//										//(When one thread creates an object it will first update the cache and then in MM)
//		return s;
//	}
	
	//#Double Locking (using Volatile Keyword) 
					  //to Directly make changes to Main Memory
	
	static volatile Student s;
	
	private Student() throws Exception{
		
		if(	s!=null ) {
			throw new Exception("Object Already created");
		}
		
	}
	
	public static Student GetInstance() throws Exception{ 
		
		synchronized (Student.class) {	
			if(s == null) {
				s = new Student();		
			}
		}								
										
		return s;
	}
	
	//#Bill Pugh Singleton (like Eager Initialization)
	
//	public static class Student_InnerClass{
//		public final static Student s = new Student();
//	}
//	
//	static Student s = new Student();
//	
//	private Student() {
//		
//	}
//	
//	public static Student GetInstance() {
//		return s;
//	}
	
}
