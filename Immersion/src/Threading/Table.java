package Threading;

public class Table {
	
	
	public void print(int n ) throws InterruptedException{
		for(int i=1;i<=n;i++) {
			System.out.println(n*i);
			Thread.sleep(4000);
		}
	}
}
