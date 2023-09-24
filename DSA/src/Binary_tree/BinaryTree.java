package Binary_tree;
import java.util.*;
public class BinaryTree {
	public class Node {
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	public BinaryTree() {
		root=createtree();
	}
	Scanner sc=new Scanner(System.in);
	private Node createtree() {
		int item =sc.nextInt();
		Node nn=new Node();
		nn.data=item;
		boolean hlc=sc.nextBoolean();	//hlc (has left child)
		if(hlc==true)
			nn.left=createtree();
		boolean hrc=sc.nextBoolean();	//hrc (has right child)
		if(hrc==true)
			nn.right=createtree();
		return nn;
	}
	private void Display(Node nn) {
		if(nn==null)
			return;
		String s="";
		s="<--"+nn.data+"-->";
		if(nn.left!=null)
			s=nn.left.data+s;
		else
			s="."+s;
		if(nn.right!=null)
			s=s+nn.right.data;
		else
			s=s+".";
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
		public void Display() {
			Display(root);
		}
		public int max() {
			return max(root);
		}
		private int max(Node nn) {
			if(nn==null)
					return Integer.MIN_VALUE;
			int left=max(nn.left);
			int right=max(nn.right);
			return Math.max(nn.data,Math.max(left, right));
		}
		public int min() {
			return min(root);
		}
		private int min(Node nn) {
			if(nn==null)
					return Integer.MAX_VALUE;
			int left=min(nn.left);
			int right=min(nn.right);
			return Math.min(nn.data,Math.min(left, right));
		}
		public boolean find(int item) {
			return find(root,item);
		}
		private boolean find(Node nn,int item) {
			if(nn==null)
				return false;
			if(nn.data==item)
					return true;
//			boolean left=find(nn.left,item);
//			boolean right=find(nn.right,item);
//			return left||right;
			return find(nn.left,item) || find(nn.right,item);
		}
		public int ht() {
			return ht(root);

		}
		private int ht(Node nn) {
			if(nn==null)
				return -1;		// we return -1 to consider the height of a node to be 0;
			int lh=ht(nn.left);	//if we want to consider the height of single node to be 1 then return 0;
			int rh=ht(nn.right);
			return Math.max(lh, rh)+1;
		}
		public void preorder() {
			preorder(root);
			System.out.println();
		}
		private void preorder(Node nn) {
			if(nn==null)
				return;
			System.out.print(nn.data+" ");
			preorder(nn.left);
			preorder(nn.right);
		}
		public void postorder() {
			postorder(root);
			System.out.println();
		}
		private void postorder(Node nn) {
			if(nn==null)
				return;
			
			postorder(nn.left);
			postorder(nn.right);
			System.out.print(nn.data+" ");
		}
		
		public void inorder() {
			inorder(root);
			System.out.println();
		}
		private void inorder(Node nn) {
			if(nn==null)
				return;
			
			inorder(nn.left);
			System.out.print(nn.data+" ");
			inorder(nn.right);
			
		}
		public void levelorder() {
			levelorder(root);
		}
		private void levelorder(Node nn) {
			Queue<Node> q=new LinkedList<>();
			q.add(nn);
			while(!q.isEmpty()) {
				Node curr=q.remove();
				System.out.print(curr.data+" ");
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
			}
			System.out.println();
		}
	}
		

