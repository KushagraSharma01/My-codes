package Stack;
public class Stack {
	int[] arr;			//default(access within a package hota hai)
	int tos;				//arr=null  ,  tos(top of stack)=0
	public Stack() {
		arr=new int[5];				//default size--->5 
		tos=-1;
	}
	public Stack(int n) {
		arr=new int[n];				//n size
		tos=-1;						//tos=-1
	}
	public boolean isEmpty() {
		return tos==-1;
	}
	public boolean isFull() {
		return tos==arr.length-1;
	}
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("baklol stack full hai");
		}
		tos++;
		arr[tos]=item;
	}
	public int size() {
		return tos+1;
	}
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("baklol stack empty hai");
		}
		int x=arr[tos];
		tos--;
		return x;
 	}
	public int peek() {
		int x=arr[tos];
		return x;
	}
	public void Display() {
		for(int i=0;i<=tos;i++) {
			System.out.print(arr[i]+"->");
		}
		System.out.println(".");
	}
}