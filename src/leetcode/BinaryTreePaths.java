package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	private void genTreePaths(List<String> resList,String fatherStr,TreeNode node){
		String str=fatherStr+"->"+node.val;
		if(node.left==null && node.right==null){
			resList.add(str);
		} 
		if(node.left!=null){
			genTreePaths(resList,str,node.left);
		}
		if(node.right!=null){
			genTreePaths(resList,str,node.right);
		}
	}
	
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res= new ArrayList<String>();
        if(root!=null){
        	String str=""+root.val;
        	if(root.left==null && root.right==null){
        		res.add(str);
        	}
        	if(root.left!=null){
        		genTreePaths(res,str,root.left);
        	}
        	if(root.right!=null){
        		genTreePaths(res,str,root.right);
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
