package prac;
import java.util.*;
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		Integer a[] = new Integer[l1.size()];
		a = l1.toArray(a);
		System.out.println(l1.toArray());
	}

}
