package Questions_Linked_list;
import Linked_List.Linked_list.Node;
import Questions_Linked_list.Linked_list_cycle.ListNode;
public class Linked_List_cycle1 {

	public class Node{
		int val;			//value
		Node next;			//address
	}
	private Node head;			//head is a data member of linked list class
	private int size;
	private Node tail;
//0(1)	{Constant}
	public void AddFirst(int item) {
		Node nn=new Node();				//value=0, address=null
		nn.val=item;					//value=1(item)
		if(size==0) {
			this.head=nn;				//head=1k
			this.tail=nn;				//tail=1k
			this.size++;				//size ko increament kr denge
		}
		else {
			nn.next=head;		//address in nn=address of head(2k)
			head=nn;			//head=1k(head ko new node pr phucha rhe hai)
			this.size++;		//size ko increament kr denge
		}
	}
	public void Display() {
		Node temp=head;				//temp=1k
		while(temp!=null) {
			System.out.print(temp.val+"->");			//temp.value=30, temp.next=3k(let)
			temp=temp.next;			//temp ke andr usi node ka address aa jayega...
		}
		System.out.println(".");
	}
	public void AddLast(int item) {
		if(size==0) {
			AddFirst(item);
		}
		else {
			Node nn=new Node();
			nn.val=item;
			tail.next=nn;			//tail.next=5k , null ki jgh agli wali node ka agla address daal do
			tail=nn;				//tail=5k(new address aa jayega jo last mai node input huyi hogi)
			size++;
		}
	}
	public void createCycle() throws Exception {
		Node nn=GetNode(2);
		this.tail.next=nn;
	}
	public Node GetNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("baklol k range me daal");
		}
		Node temp=head;		//temp=1k
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public Node hasCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null) {
        	slow=slow.next;
        	fast=fast.next.next;
        	if(slow==fast) {
        		return slow;
        	}
        }
        return null;
    }
	//0(n^2)
	public void CycleRemoval1() {
		Node Meet=hasCycle(head);
		if(Meet==null) {
			return;
		}
		Node curr=head;
		while(curr!=null) {
			Node temp=Meet;
			while(temp.next!=Meet) {		//cycle se move krna
				if(temp.next==curr) {
					temp.next=null;
					return;
				}
				temp=temp.next;
			}
			curr=curr.next;
		}
	}
	//0(n)
	public void CycleRemoval2() {
		Node Meet=hasCycle(head);
		if(Meet==null) {
			return;
		}
		// Cycle ka count
		Node temp=Meet;
		int count=1;
		while(temp.next!=Meet) {
			count++;
			temp=temp.next;
		}
		//  m length aage jayega
		Node fast=head;
		for(int i=0;i<=count;i++) {
			fast=fast.next;
		}
		Node slow=head;
		while(slow.next!=fast.next) {
			fast=fast.next;
			slow=slow.next;
		}
		fast.next=null;
	}
	
	//0(n)
	public void floydCycleRemoval() {
		Node Meet=hasCycle(head);
		if(Meet==null) {
			return;
		}
		Node slow=head;
		Node fast=Meet;
		while(slow.next==fast.next) {
			fast=fast.next;
			slow=slow.next;
		}
		fast.next=null;
	}
	
}
