package leetcode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MinimumDepth {
	private HashSet<Integer> depthSet= new HashSet<Integer>();
	private void getDepth(TreeNode node,int fatherDepth){
		if(node.left!=null){
			getDepth(node.left,fatherDepth+1);
		}
		if(node.right!=null){
			getDepth(node.right,fatherDepth+1);
		}
		if(node.right==null&&node.left==null){
			depthSet.add(fatherDepth);
		}
	}
	public int minDepth(TreeNode root) {
		int minium;
        if(root==null){
        	return 0;
        }else{
        	getDepth(root,1);
        }
        Iterator<Integer> iterator=depthSet.iterator();
        	minium=iterator.next();
        	while(iterator.hasNext()){
            	int tmp=iterator.next();
            	if(tmp<minium){
            		minium=tmp;
            	}
            }
        	return minium;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
