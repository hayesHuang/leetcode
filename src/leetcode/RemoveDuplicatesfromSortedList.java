package leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        while(node!=null&&node.next!=null){
        	if(node.val==node.next.val){
        		node.next=node.next.next;
        	}else{
        		node=node.next;
        	}
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
