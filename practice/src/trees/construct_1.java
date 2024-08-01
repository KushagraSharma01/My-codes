package trees;
import java.util.*;
public class construct_1 {
	//for -1 input level order
	Scanner sc=new Scanner(System.in);
	private class Node{
		int data;
		Node left;
		Node right;
		
	}
	Node root=new Node();
	public void createtree() {
		createtree(this.root);
	}
	private void createtree(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		root.data=sc.nextInt();
		q.add(null);
		while(!q.isEmpty()) {
			Node f=q.remove();
			if(f==null) {
				if(q.isEmpty())
					break;
				q.add(null);
			}
			else {
				int datal=sc.nextInt();
				if(datal!=-1) {
					Node left=new Node();
					left.data=datal;
					f.left=left;
					q.add(left);
				}
				int datar=sc.nextInt();
				if(datar!=-1) {
					Node right=new Node();
					right.data=datar;
					f.right=right;
					q.add(right);
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
		construct_1 bt=new construct_1();
		bt.createtree();
		bt.print();
	}
}
