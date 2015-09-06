package leetcode;

class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
 }

public class SymmetricTree {
	public static String traversalLeft(TreeNode node){
		String result="";
	    result+=node.val+",";
	    if(node.left==null){
	    	result+="#,";
	    }else{
	    	result+=traversalLeft(node.left);
	    }
	    if(node.right==null){
	    	result+="#,";
	    }else{
	    	result+=traversalLeft(node.right);
	    }
		return result;
	}
	
	public static String traversalRight(TreeNode node){
		String result="";
		result+=node.val+",";
		if(node.right==null){
			result+="#,";
		}else{
			result+=traversalRight(node.right);
		}
		if(node.left==null){
			result+="#,";
		}else{
			result+=traversalRight(node.left);
		}
		return result;
	}
	public boolean isSymmetric(TreeNode root) {
		String right="#";
		String left="#";
		if(root==null)return true;
		if(root.left!=null){
			left=traversalLeft(root.left);
		}
		if(root.right!=null){
			right=traversalRight(root.right);
		}
        return left.equals(right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
