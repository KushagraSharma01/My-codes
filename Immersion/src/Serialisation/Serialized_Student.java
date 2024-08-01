package Serialisation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Serialized_Student implements Serializable{
	
	String s = "Raj";
	int age = 24;
	public Serialized_Student(){
		
	}
	
//	public Object readResolve() {
//		
//	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialized_Student s = new Serialized_Student();
		
		String file = "C:\\Users\\kusha\\Desktop\\output.txt";
		FileOutputStream fo = new FileOutputStream(file); 
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		os.writeObject(s);
		System.out.println("hi");
		
		FileInputStream fi = new FileInputStream(file); 
		ObjectInputStream io = new ObjectInputStream(fi);		//reading input string and converting in object
		Serialized_Student s1 = (Serialized_Student) io.readObject();	
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
	
}
