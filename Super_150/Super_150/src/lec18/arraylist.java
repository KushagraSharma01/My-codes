package lec18;
import java.util.ArrayList;
public class arraylist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		list.add(1,50);		// we can add element from 0 to size(range) or index ka range 0 to size
		System.out.println(list);//after adding it shifts the elements after by itself
		
		//remove
		System.out.println(list.remove(3)); //index ka range 0 to size-1
		System.out.println(list);
		list.add(2);
		list.add(3);
		
		//get
		System.out.println(list.get(2));
		System.out.println(list);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		list.set(3, -90);
		System.out.println(list);
		
	}

}
