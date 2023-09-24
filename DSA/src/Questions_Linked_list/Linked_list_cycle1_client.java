package Questions_Linked_list;

public class Linked_list_cycle1_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_List_cycle1 ll=new Linked_List_cycle1();
		ll.AddLast(1);
		ll.AddLast(2);
		ll.AddLast(3);
		ll.AddLast(4);
		ll.AddLast(5);
		ll.AddLast(6);
		ll.AddLast(7);
		ll.AddLast(8);
		ll.Display();
		//ll.CycleRemoval1();			//O(n2)
		ll.Display();
		//ll.CycleRemoval2();			//O(n)
		ll.Display();
		ll.floydCycleRemoval();
		ll.Display();					//O(n)
		
	}
}
