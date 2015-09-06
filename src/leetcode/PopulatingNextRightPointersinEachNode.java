package leetcode;

class TreeLinkNode {
	int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}
public class PopulatingNextRightPointersinEachNode {
	private void connectEachLevel(TreeLinkNode levelHead){
		if(levelHead.left==null){
			return;
		}
		TreeLinkNode pointer=levelHead;
		while(pointer!=null){
			pointer.left.next=pointer.right;
			TreeLinkNode next=pointer.next;
			if(next!=null){
				pointer.right.next=next.left;
			}
			pointer=next;
		}
		connectEachLevel(levelHead.left);
	}
    public void connect(TreeLinkNode root) {
        if(root==null){
        	return;
        }else{
        	root.next=null;
        }
        connectEachLevel(root);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
