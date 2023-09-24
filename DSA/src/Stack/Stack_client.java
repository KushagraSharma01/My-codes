package Stack;
public class Stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st=new Stack();		//take default array size of 5
		//Stack st1=new Stack(7);    //take array of size n (which is given by user)
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st.size());
		st.Display();
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
	}


}
