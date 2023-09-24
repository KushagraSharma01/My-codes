package Questions_Stack_Queue;
import java.util.Stack;
public class Q_3 {
	//reverse the Stack.....
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		//Stack<Integer> st1=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}
	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int item=st.pop();
		reverse(st);
		Insert_Down(st,item);
	}
	public static void Insert_Down(Stack<Integer> st, int ele) {	//insert element at bottom....
		if(st.isEmpty()) {
			st.push(ele);
			return;
		}
		int k=st.pop();
		Insert_Down(st,ele);
		st.push(k);
	}
//	public static void reverse(Stack<Integer> st, Stack<Integer> st1) {
//	if(st.isEmpty()) {
//		return;
//	}
//	int item=st.pop();
//	st1.push(item);
//	reverse(st,st1);	
//}
}