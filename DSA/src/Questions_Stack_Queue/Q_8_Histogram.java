package Questions_Stack_Queue;
import java.util.Stack;
public class Q_8_Histogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,4,6,1,7};
		System.out.println(Area(arr));
	}
	public static int Area(int[] arr) {
		int ans=0;
		Stack<Integer> st=new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				if(st.isEmpty()) {
					int a=h*i;				//area of taken out rectangle till current index (as every other element in between must be greater than it to be popped out
					ans=Math.max(ans, a);	//or current index is just the next index of taken out rectangle)
				}
				else {
					int a=h*(i-st.peek()-1); //area of taken out rectangle till the last smaller rectangle index in stack (as every rectangle in between must be greater  
					ans=Math.max(ans, a);	// and must be popped out)
				}
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			
			if(st.isEmpty()) {
				int a=h*arr.length;				//same as above but now validates for complete array
				ans=Math.max(ans, a);
			}
			else {
				int l=st.peek();
				int a=h*(arr.length-st.peek()-1);
				ans=Math.max(ans, a);
			}
		}
		return ans;
	}

}
