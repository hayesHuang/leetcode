package leetcode;

public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        ListNode next= node.next;
        node.val=next.val;
        node.next=next.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
