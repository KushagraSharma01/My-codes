package prac;
import java.util.*;
public class pq {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int ropes[]= {4,3,2,6};
		for(int i=0;i<ropes.length;i++) {
			pq.add(ropes[i]);
		}
		
		int sum=0;
		while(pq.size()>1) {
			int a=pq.remove();
			int b=pq.remove();
			sum+=a+b;
			pq.add(a+b);
		}
		System.out.println(sum);

	}

}