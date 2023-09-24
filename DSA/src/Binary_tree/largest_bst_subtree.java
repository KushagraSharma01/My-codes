package Binary_tree;

public class largest_bst_subtree {
	public bstpair validbst(TreeNode root){
        if(root==null)
            return new bstpair();
        bstpair lbp=validbst(root.left);
        bstpair rbp=validbst(root.right);
        bstpair sbp=new bstpair();
        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min=Math.min(root.val,Math.min(lbp.min,rbp.min));
        if(lbp.isbst&&rbp.isbst&&lbp.max<root.val&&rbp.min>root.val) {
        	sbp.isbst=true;
        	sbp.size=lbp.size+rbp.size+1;
        }
            
        else {
            sbp.isbst=false;
            sbp.size=Math.max(lbp.size,rbp.size);
        }
        return sbp;
    }
    class bstpair{
        boolean isbst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        int size=0;
    }
}
