package leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class MaximumDepth {
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
	public int maxDepth(TreeNode root) {
		int maximum;
        if(root==null){
        	return 0;
        }else{
        	getDepth(root,1);
        }
        Iterator<Integer> iterator=depthSet.iterator();
        	maximum=iterator.next();
        	while(iterator.hasNext()){
            	int tmp=iterator.next();
            	if(tmp>maximum){
            		maximum=tmp;
            	}
            }
        	return maximum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
