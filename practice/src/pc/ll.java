package pc;

public class ll {
	class Node {
		int data;
		Node next;//store the address of next node/
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	Node head=null;
	Node tail=null;
	public void addnode(int data) {
		Node nn=new Node(data);
		if(head==null) {
			head=nn;
			tail=nn;
		}
		else {
			tail.next=nn;
			tail=nn;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
