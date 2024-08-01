package new_problems;
import java.util.*;
public class Number_of_Valid_Subarrays_1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,2,5,3};
		
		NumberofSubarray(a);
		
		
	}
	
	public static void NumberofSubarray(int [] arr) {	//holding the last index of stack and counting the number of subarrays with
		int ans = 0;									//starting with every index present in stack(equals size of stack)
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty()&&arr[i]<arr[st.peek()])
				st.pop();
			st.push(i);
			ans += st.size();
		}
		System.out.println(ans+" ");
	}

//	int sm = Integer.MAX_VALUE,sm2 = Integer.MAX_VALUE;
//	int ei = 0, si = 0;
//	int c=0;
//	while(ei<a.length) {
//		while(a[ei]>sm2&&si<=ei) {
//			if(a[si] == sm)
//		}
//	}
}
