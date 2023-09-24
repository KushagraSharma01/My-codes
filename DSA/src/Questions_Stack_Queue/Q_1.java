package Questions_Stack_Queue;
import java.util.Stack;
public class Q_1 {
	public static void main(String[] args) {
		// Access the bottom last element from the stack...
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(21);
		st.push(19);
		st.push(11);
		st.push(18);
		System.out.println(LastValue(st));
		System.out.println(st);
	}
	public static int LastValue(Stack<Integer> st) {
		if(st.size()==1) {
			return st.peek();
		}
		int item=st.pop();
		int x=LastValue(st);
		st.push(item);
		return x;
	}
}
