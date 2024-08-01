package Threading;

public class TableThread1 implements Runnable{	//interface or inheritance something something(Use Runnable because multiple
	private Table t;							//inheritance not allowed in java for Thread class)
												
	public TableThread1(Table t) {				
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			t.print(9);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
