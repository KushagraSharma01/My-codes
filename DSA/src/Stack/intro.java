package Stack;
import java.util.Stack;
public class intro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack is a LIFO (last in first out) symmetric....
		//TO optimize the code we use data structure.....
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.peek());     //print the top element of the stack
		System.out.println(st);			   // Print full stack
		System.out.println(st.pop());	   // Remove peek element from the stack
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.isEmpty());
	}
}
//push
//pop
//peek
//isfull
//isempty
//size
//display