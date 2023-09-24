package Questions_Stack_Queue;
import java.util.Stack;
public class Q_11_Celebrity_problem {

	public static void main(String[] args) {
		int n=4;
		int[][] arr= {{0,1,1,0},{0,0,1,1},{0,0,0,0},{0,1,1,0}};
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int x=st.pop();
			int y=st.pop();
			if(arr[x][y]==1) {			//x , y ko jaanta hai
				st.push(y);
			}
			else {						//x , y ko nhi janta
				st.push(x);
			}
			
		}
		System.out.println(isCelebrity(st,arr));
		
	}

	public static String isCelebrity(Stack<Integer> st, int[][] arr) {
		while(!st.isEmpty()) {
			int h=st.pop();
			for(int i=0;i<arr.length;i++) {
				if(arr[h][i]!=0) {
					return "No";
				}
				if(arr[h][h]!=0 ||arr[i][h]!=1) {
					return "No";
				}
			}
		}
		return "Yes";
		
	}

}
