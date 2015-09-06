package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
	private void inorderTraversal(List<Integer> traversalSequence,TreeNode father){
		if(father.left!=null){
			inorderTraversal(traversalSequence,father.left);
		}
		traversalSequence.add(father.val);
		if(father.right!=null){
			inorderTraversal(traversalSequence,father.right);
		}
	}
    public boolean isValidBST(TreeNode root) {
    	List<Integer> traversalSequence = new ArrayList<Integer>();
        if(root!=null){
        	inorderTraversal(traversalSequence,root);
        }
        boolean valid=true;
        int i=1;
        while(valid&&i<traversalSequence.size()){
        	if(traversalSequence.get(i)>traversalSequence.get(i-1)){
        		i++;
        	}else{
        		valid=false;
        	}
        }
        return valid;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
