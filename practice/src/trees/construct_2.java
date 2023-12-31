package trees;
import java.util.*;
public class construct_2 {
	//true false (preorder input) tree
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
		this.root=createtree(this.root);
	}
	private Node createtree(Node root) {
		int a=sc.nextInt();
		Node rootn=new Node();
		rootn.data=a;
		boolean hlc=sc.nextBoolean();
		if(hlc) 
			rootn.left=createtree(rootn);
		boolean hrc=sc.nextBoolean();
		if(hrc)
			rootn.right=createtree(rootn);
		return rootn;
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
		construct_2 bt=new construct_2();
		bt.createtree();
		bt.print();
	}
}
