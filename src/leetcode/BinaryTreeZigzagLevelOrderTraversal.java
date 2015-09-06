package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean toRight=true;
        Stack<TreeNode> line = new Stack<TreeNode>();
        if(root!=null){
            line.push(root);        	
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        while(!line.isEmpty()){
        	Stack<TreeNode> nextLine = new Stack<TreeNode>();
        	List<Integer> resRow = new ArrayList<Integer>();
        	if(toRight){
        		while(!line.isEmpty()){
        			TreeNode node = line.pop();
           		 	resRow.add(node.val);
           		 	if(node.left!=null){
           		 		nextLine.push(node.left);
           		 	}
           		 	if(node.right!=null){
           		 		nextLine.push(node.right);
           		 	}
        		}
        	}else{
        		while(!line.isEmpty()){
        			TreeNode node = line.pop();
        			resRow.add(node.val);
        			if(node.right!=null){
           		 		nextLine.push(node.right);
           		 	}
        			if(node.left!=null){
           		 		nextLine.push(node.left);
           		 	}
        		}
        	}
        	result.add(resRow);
        	line=nextLine;
        	toRight=!toRight;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
