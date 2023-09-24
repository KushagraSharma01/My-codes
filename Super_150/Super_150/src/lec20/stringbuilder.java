package lec20;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub					//classes are of non-primitive datatypes	
		StringBuilder sb=new StringBuilder("Hello");		//differentiate between capacity and size
		System.out.println(sb.length());
		sb.append('c');
		System.out.println(sb.capacity());   				//By default capacity is 16
		sb.append("bye");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append("HellocB");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("abcde");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append('a');
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.insert(1,"ll");
		System.out.println(sb);
		String s=sb.toString();						//Builder to String
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(1,3));			//Builder is same as String but you can change values in it when
														//it has capacity and it is faster also
		
	}

}
