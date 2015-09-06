package leetcode;

public class ConvertSortedArraytoBinarySearchTree {
	private TreeNode buildBST(int[] num,int start,int end){
		if(start>end) return null;
		int middle = (start+end)/2;
		TreeNode root = new TreeNode(num[middle]);
		root.left=buildBST(num,start,middle-1);
		root.right=buildBST(num,middle+1,end);
		return root;
	}
    public TreeNode sortedArrayToBST(int[] num) {
        return buildBST(num,0,num.length-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
