package Queue;

public class Queue {

	protected int[] arry;
	protected int front;
	protected int size;
	public Queue() {
		arry=new int[5];
		front =0;
		size=0;
	}
	public Queue(int n) {
		arry=new int[n];
		front =0;
		size=0;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arry.length;
	}
	public int size() {
		return size;
	}
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Baklol queue full hai");
		}
		int idx=(front+size)%arry.length;		//for circular Queue
		arry[idx]=item;
		size++;
	}
	public int Dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Baklol queue empty hai");
		}
		int rv=arry[front];
		front = (front+1)%arry.length;
		size--;
		return rv;
	}
	public int GetFront() {
		int rv=arry[front];
		return rv;
	}
	public void Display() {
		for(int i=0;i<size;i++) {
			int idx=(front+i)%arry.length;
			System.out.print(arry[idx]+" ");
		}
		System.out.println();
	}
}
