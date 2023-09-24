package oops2_lec1;
public class Gen_LinkedList <G>{
	public class Node{
		G val;			//value
		Node next;			//address
	}
	private Node head;			//head is a data member of linked list class
	private int size;
	private Node tail;
//0(1)	{Constant}
	public void AddFirst(G item) {
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
	public void AddLast(G item) {
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
	
	public void AddatIndex(G item, int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("baklol k range me daal");
		}
		if(k==0) {
			AddFirst(item);
		}
		else if(k==size) {
			AddLast(item);
		}
		else {
			Node nn=new Node();
			nn.val=item;
			Node k_1th=GetNode(k-1);
			nn.next=k_1th.next;
			k_1th.next=nn;
			size++;
		}
	}
	public G GetFirst() {
		return head.val;
	}
	public G GetLast() {
		return tail.val;
	}
	public G GetatIndex(int k) throws Exception {
		return GetNode(k).val;
	}
	public G removeFirst() throws Exception {
		if(size==0) {
			throw new Exception("Baklol linkedlist empty hai");
		}
		G rv=head.val;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}
		else {
			Node temp=head;
			head=head.next;
			temp.next=null;
			size--;
		}
		return rv;
	}
	public G removeLast() throws Exception{
		if(size==0) {
			throw new Exception("Baklol linkedlist empty hai");
		}
		G rv=tail.val;
		if(size==1) {
			return removeFirst();
		}
		else {
			
			Node n=GetNode(size-2);
			tail=n;
			tail.next=null;
			size--;
			return rv;
		}
		
	}
	public G removeatIndex(int k) throws Exception{
		if(size==0) {
			throw new Exception("Baklol linkedlist empty hai");
		}
		if(k==0) {
			return removeFirst();
		}
		else if(k==size-1){
			return removeLast();
		}
		else {
			Node k_1th=GetNode(k-1);
			Node kth=k_1th.next;
			k_1th.next=kth.next;
			kth.next=null;
			size--;
			return kth.val;
		}
	}
	public static void main(String[] args) {
		Gen_LinkedList<String> ll=new Gen_LinkedList<>();
		ll.AddLast("Raj");
		ll.AddLast("Ankit");
		ll.AddLast("Kunal");
		ll.AddLast("Naman");
		ll.AddLast("Vedansh");
		ll.Display();
	}
}
//git changes