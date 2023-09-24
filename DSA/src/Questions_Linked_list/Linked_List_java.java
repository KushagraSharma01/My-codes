package Questions_Linked_list;
import java.util.LinkedList;
import java.util.Queue;
public class Linked_List_java {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(0,5);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.remove());
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list);
		Queue<Integer> q=new LinkedList();
		LinkedList<Integer> q1=new LinkedList();
	}
}
