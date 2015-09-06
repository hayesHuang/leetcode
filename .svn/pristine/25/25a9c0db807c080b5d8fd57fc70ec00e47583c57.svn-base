package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
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
public class PathSum2 {
	private int sum;
	private List<List<Integer>> result = new ArrayList<List<Integer>>();
	public void traversal(TreeNode father, int fatherSum, List<Integer> path){
		if(father!=null){
			ArrayList<Integer> pathList = new ArrayList<Integer>(path);
			pathList.add(father.val);
			if(father.left==null&&father.right==null){
				if(fatherSum+father.val==sum){
					result.add(pathList);
				}
			}else{
				traversal(father.left,fatherSum+father.val,pathList);
				traversal(father.right,fatherSum+father.val,pathList);
			}
		}
	}
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        this.sum=sum;
        traversal(root,0,new ArrayList<Integer>());
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
