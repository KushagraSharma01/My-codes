package heap;
import java.util.Collections;
import java.nio.file.spi.FileSystemProvider;
import java.util.PriorityQueue;
public class heap_demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq1=new PriorityQueue<>();	//by default min heap
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //max heap
		pq.add(5);
		pq.add(7);
		pq.add(6);
		pq.add(1);
		pq.add(4);
		pq.add(9);
		pq.add(7);
		pq.add(3);
		System.out.println(pq);
		while(!pq.isEmpty()) {				//pq is sorted when taken out elements from it
			System.out.print(pq.poll() + " ");
		}
		System.out.println(pq.peek());
		System.out.println(pq.poll());
	}
	//215 kth largest element
}
