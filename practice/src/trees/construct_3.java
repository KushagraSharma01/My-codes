package trees;
import java.util.*;
public class construct_3 {
	//single N input(level order)
	Scanner sc=new Scanner(System.in);
	private class Node{
		int data;
		Node left;
		Node right;
		Node(){
			//constructor
		}
	}
	private Node root=new Node();
	public void createtree() {
		createtree(this.root);
	}
	private void createtree(Node root) {
		Queue<Node> q=new LinkedList<>();
		root.data=sc.nextInt();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node f=q.remove();
			if(f==null) {
				if(q.isEmpty())
					break;
				q.add(null);
			}
			else {
				if(sc.hasNext()) {
				String l=sc.next();
				if(l.equals("exit"))
					break;
				if(!l.equals("N")) {
					Node left=new Node();
					left.data=Integer.parseInt(l);
					f.left=left;
					q.add(left);
				}
				}
				if(sc.hasNext()) {
					String r=sc.next();
					if(!r.equals("N")) {
						Node right=new Node();
						right.data=Integer.parseInt(r);
						f.right=right;
						q.add(right);
					}
					}
			}
		}
	}
	public void print() {
		print(this.root);
	}
	private void print(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}
	public static void main(String[] args) {
		construct_3 bt=new construct_3();
		bt.createtree();
		bt.print();
	}
}
