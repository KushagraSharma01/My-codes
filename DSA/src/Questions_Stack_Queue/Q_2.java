package Questions_Stack_Queue;

import java.util.Stack;

public class Q_2 {
	
	public static void main(String[] args) {
		// Add one element in the bottom last in the Stack......
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(21);
		st.push(19);
		st.push(18);
		System.out.println(st);
		LastValueInsert(st,20);
		System.out.println(st);
	}
	public static void LastValueInsert(Stack<Integer> st,int ele) {
		if(st.isEmpty()) {
			st.push(ele); 
			return;
		}
		int item=st.pop();
		LastValueInsert(st,ele);
		st.push(item);
		return;
	}
}
