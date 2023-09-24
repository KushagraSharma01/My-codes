package Questions_Stack_Queue;
import java.util.Stack;
public class Q_5 {
	//Next Greater Element
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {11,2,3,23,13,9,15};
		Next_greater_ele(arry);
	}
	public static void Next_greater_ele(int[] arry) {
		int[] ans=new int[arry.length];
		Stack<Integer> st=new Stack< >();
		for(int i=0;i<arry.length;i++) {
			while(!st.isEmpty() && arry[i]>arry[st.peek()]) {
				ans[st.pop()]=arry[i];
			}
			st.push(i);			//first pop element from the stack(stack point out the index not the element) after that add next greater element at same position
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;			//first pop element from the stack(stack point out the index not the element) after that add -1 at same position
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arry[i]+" " +ans[i]);
		}
	}
}
