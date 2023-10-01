package pc;
import java.util.*;
public class iteratorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			pq.add(5);
			pq.add(4);
			pq.add(3);
			pq.add(2);
			pq.add(1);
			Iterator<Integer> v=pq.iterator();
			while(v.hasNext()) {
				System.out.println(v.next());
			}
	}

}
