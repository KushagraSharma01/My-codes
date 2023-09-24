package Binary_tree;

public class Binarytree_client {
	//10 true 5 true 2 false false true 6 true 7 true 8 false false false true 91 false false true 7 false true 71 true 11 false false true 9 true 15 false false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt=new BinaryTree();
		bt.Display();
		System.out.println(bt.find(3));
		System.out.println(bt.max());
		System.out.println(bt.min());
		System.out.println(bt.ht());
		bt.preorder();
		bt.postorder();
		bt.inorder();
		bt.levelorder();
	}

}
