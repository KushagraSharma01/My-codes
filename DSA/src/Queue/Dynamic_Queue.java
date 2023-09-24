package Queue;

public class Dynamic_Queue extends Queue {			//Dynamic_Queue--->child
													//Queue--->Parent
													//Dynamic_Queue inherits the property of queue

	@Override
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int[] a=new int[2*arry.length];
			for(int i=0;i<arry.length;i++) {
				int idx=(front+i)%arry.length;
				a[i]=arry[idx];	
			}
			front=0;
			arry=a;
		}
		super.Enqueue(item);
	}
	public void length() {
		System.out.println(arry.length);
	}
}
