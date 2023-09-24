package pc;
import java.util.*;
import java.util.ArrayList;
public class pcpc {
	//Definition for a binary tree node.
	public static class node
	{
	    int data;
	    node left;
	    node right;
	}
	 static node newNode(int data)
	{
	    node n = new node();
	    n.data = data;
	    n.left = null;
	    n.right = null;
	    return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		     1
		  2	   3
		4  5 6   7
		
		 */
		node root=new node();
		root=newNode(1);
		root.left=newNode(2);
		root.right=newNode(3);
		root.left.left=newNode(4);
		root.left.right=newNode(5);
		root.right.left=newNode(6);
		root.right.right=newNode(7);
		
		int k=3;
		List<List<Integer>> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		Klevel(root,k,l1,l2);
		
	}
	
	public static void Klevel(node n,int k,List<List<Integer>> l1,List<Integer> l2)
	{
		int c=0;
		Queue<node> q=new LinkedList<>();
        if(n == null){
            return ;
        }
        q.add(n);
        q.add(null);
        while(!q.isEmpty()){
            node curr=q.remove();
            if(curr==null)
            {
                if(c==k-1){
                    while(!q.isEmpty()) {
                    	node ce=q.remove();
                      System.out.print(ce.data);
                    //break;
                    }
                }
                l1.add(List.copyOf(l2));
                l2.clear();
                if(q.isEmpty())
                {
                    break;
                }
                else
                    q.add(null);
            }
            else{
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }

        }
	}


}