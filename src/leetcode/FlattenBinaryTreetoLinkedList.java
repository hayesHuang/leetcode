package leetcode;

public class FlattenBinaryTreetoLinkedList {
	private static TreeNode listPointer;
	public void preOrderTraversal(TreeNode root){
		if(root==null) return;
		TreeNode left=root.left;
		TreeNode right=root.right;
		listPointer.right=root;
		root.left=null;
		listPointer=listPointer.right;
		preOrderTraversal(left);
		preOrderTraversal(right);
	}
    public void flatten(TreeNode root) {
    	if(root!=null){
    		TreeNode left=root.left;
    		TreeNode right=root.right;
    		root.left=null;
    		listPointer=root;
    		preOrderTraversal(left);
    		preOrderTraversal(right);
    	}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
