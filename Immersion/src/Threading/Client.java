package Threading;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		TableThread1 th = new TableThread1(t);
		Thread thread = new Thread(th);
		thread.start();
	}

}
