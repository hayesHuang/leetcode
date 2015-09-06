package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeInorderTraversal {
	
	private void inorderTraversal(List<Integer> traversalSequence,TreeNode father){
		if(father.left!=null){
			inorderTraversal(traversalSequence,father.left);
		}
		traversalSequence.add(father.val);
		if(father.right!=null){
			inorderTraversal(traversalSequence,father.right);
		}
	}
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> traversalSequence = new ArrayList<Integer>();
        if(root!=null){
        	inorderTraversal(traversalSequence,root);
        }
        return traversalSequence;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
