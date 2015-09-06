package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	private List<List<Integer>> result = new ArrayList();
	private void levelTraversal(List<TreeNode> levelList){
		List<TreeNode> nextLevelList = new ArrayList<TreeNode>();
		List<Integer> valList = new ArrayList<Integer>();
		for(TreeNode node:levelList){
			valList.add(node.val);
			if(node.left!=null){
				nextLevelList.add(node.left);
			}
			if(node.right!=null){
				nextLevelList.add(node.right);
			}
		}
		result.add(valList);
		if(!nextLevelList.isEmpty()){
			levelTraversal(nextLevelList);
		}
	}
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null){
			
		}else{
			List<TreeNode> nextLevelList = new ArrayList<TreeNode>();
			nextLevelList.add(root);
			levelTraversal(nextLevelList);
		}
	    return result;   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
