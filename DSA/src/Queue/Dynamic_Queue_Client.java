package Queue;

public class Dynamic_Queue_Client extends Dynamic_Queue {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Dynamic_Queue dq= new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Display();
		dq.size();
		dq.length();
	}

}
