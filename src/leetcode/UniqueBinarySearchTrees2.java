package leetcode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTrees2 {
	
	private List<TreeNode> createTrees(int start,int end){
		List<TreeNode> results = new ArrayList<TreeNode>();
		if(start>end){
			results.add(null);
			return results;
		}
		for(int i=start;i<=end;i++){
			List<TreeNode> left = createTrees(start,i-1);
			List<TreeNode> right = createTrees(i+1,end);
			for(int j=0;j<left.size();j++){
				for(int k=0;k<right.size();k++){
					TreeNode root = new TreeNode(i);
					root.left=left.get(j);
					root.right=right.get(k);
					results.add(root);
				}
			}
		}
		return results;
	}
    public List<TreeNode> generateTrees(int n) {
        return createTrees(1,n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
