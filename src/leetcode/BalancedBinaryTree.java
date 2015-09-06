package leetcode;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BalancedBinaryTree {
	public int balancedDepth(TreeNode node){
		if(node==null){
			return 0;
		}
		if(node.left==null&&node.right==null){
			return 1;
		}
		int leftdepth =balancedDepth(node.left);
		int rightdepth =balancedDepth(node.right);
		if(leftdepth<0||rightdepth<0){
			return -1;
		}
		if(((leftdepth-rightdepth)<2)&&
				((leftdepth-rightdepth)>-2)){
			return leftdepth>rightdepth ? 
					leftdepth+1:rightdepth+1;
		}else{
			return -1;
		}
	}
	public boolean isBalanced(TreeNode root) {
		if(balancedDepth(root)>=0){
			return true;
		}else{
			return false;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
