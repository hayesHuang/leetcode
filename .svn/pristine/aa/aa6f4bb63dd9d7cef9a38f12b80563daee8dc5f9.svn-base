package leetcode;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	private int leftLength(int root,int[] inorder,int inStart,int inEnd){
		int index=inStart;
		while(inorder[index]!=root){
			index++;
		}
		return index-inStart;
	}
	private TreeNode buildTree(int[] preorder, int preStart,int preEnd,int[] inorder,int inStart,int inEnd){
		if(preStart>preEnd){
			return null;
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		if(preStart==preEnd){
			root.left=null;
			root.right=null;
		}else{
			int lLength =leftLength(preorder[preStart],inorder,inStart,inEnd);
			root.left=buildTree(preorder,preStart+1,preStart+lLength,inorder,inStart,inStart+lLength-1);
			root.right=buildTree(preorder,preStart+lLength+1,preEnd,inorder,inStart+lLength+1,inEnd);
		}
		return root;
	}
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
