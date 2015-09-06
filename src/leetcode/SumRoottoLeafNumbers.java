package leetcode;

import java.util.ArrayList;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumRoottoLeafNumbers {
	private ArrayList<Integer> numbers= new ArrayList<Integer>();
	private void traversal(TreeNode father,int fatherNum){
		int sum=fatherNum*10+father.val;
		if(father.left==null&&father.right==null){
			numbers.add(sum);
		}
		if(father.left!=null){
			traversal(father.left,sum);
		}
		if(father.right!=null){
			traversal(father.right,sum);
		}
		
	}
	public int sumNumbers(TreeNode root) {
		if(root!=null)traversal(root,0);
		int sum=0;
		for(int num:numbers){
			sum+=num;
		}
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
