package Linked_List;
public class Linked_list_client {
	public static void main(String[] args) throws Exception {
		Linked_list ll=new Linked_list();
		ll.AddFirst(3);
		ll.AddFirst(-3);
		ll.AddFirst(1);
		ll.AddFirst(30);
		ll.Display();
		ll.AddLast(34);
		ll.Display();
		ll.AddatIndex(-9,2);
		ll.Display();
		System.out.println(ll.GetFirst());
		System.out.println(ll.GetLast());
		System.out.println(ll.GetatIndex(2));
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removeLast());
		ll.Display();
		System.out.println(ll.removeatIndex(1));
		ll.Display();
	}
}
