package Stack;
public class Dynamic_Stack extends Stack {			//child--->Dynamic_Stack....
													//parent--->Stack
													//child inherits the properties of parent
	
	@Override
	public void push(int item) throws Exception{
		if(this.isFull()) {
			int[] a=new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				a[i]=arr[i];
			}
			arr=a;
		}
		//push(item);   //take push from same class
		super.push(item);		//child stack accessing the parent stack
								//take push from another class(Stack)
		
	}
	public void length() {
		System.out.println(arr.length);
	}
}