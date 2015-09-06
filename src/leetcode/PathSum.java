package leetcode;

import java.util.HashSet;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class PathSum {
	private HashSet<Integer> sumSet= new HashSet<Integer>();
	public void traversal(TreeNode father, int fatherSum){
		if(father!=null){
			if(father.left==null&&father.right==null){
				sumSet.add(fatherSum+father.val);
			}else{
				traversal(father.left,fatherSum+father.val);
				traversal(father.right,fatherSum+father.val);
			}
		}
	}
	public boolean hasPathSum(TreeNode root, int sum) {
		traversal(root,0);
		if(sumSet.contains(sum)){
			return true;
		}else{
			return false;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
