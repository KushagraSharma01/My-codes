package Binary_tree;
import java.util.*;
public class construct_bst_levelorder {
	public class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc=new Scanner(System.in);
	public construct_bst_levelorder() {
		CreateTree();
	}
	private void CreateTree() {
		int item=sc.nextInt();
		Node nn=new Node();
		nn.val=item;
		root=nn;
		Queue<Node> q=new LinkedList<>();
		q.add(nn);
		while(!q.isEmpty()) {
			Node rv=q.remove();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node ll=new Node();
				ll.val=c1;
				rv.left=ll;
				q.add(ll);
			}
			if(c2!=-1) {
				Node rr=new Node();
				rr.val=c2;
				rv.right=rr;
				q.add(rr);
			}
		}
	}
	public void print() {
		preorder(root);
	}
	private void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.val+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String[] args) {
		construct_bst_levelorder bt=new construct_bst_levelorder();
		bt.print();
		
	}
}

