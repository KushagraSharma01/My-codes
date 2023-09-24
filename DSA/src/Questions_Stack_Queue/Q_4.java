package Questions_Stack_Queue;
import Queue.Dynamic_Queue;
public class Q_4 {
	//reverse the Queue
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Queue dq=new Dynamic_Queue();
		dq.Enqueue(1);
		dq.Enqueue(2);
		dq.Enqueue(3);
		dq.Enqueue(4);
		dq.Display();
		reverse(dq);
		dq.Display();
	}
	public static void reverse(Dynamic_Queue dq) throws Exception {
		if(dq.isEmpty()) {
			return;
		}
		int x=dq.Dequeue();
		reverse(dq);
		dq.Enqueue(x);
	}
}
