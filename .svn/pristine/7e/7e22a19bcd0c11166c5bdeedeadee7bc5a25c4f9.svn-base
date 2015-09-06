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
public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode pointer = newHead;
        pointer.next=head;
        for(int i=1;i<m;i++){
        	pointer=pointer.next;
        }
        ListNode reversePre = pointer;
        pointer=pointer.next;
        ListNode reverseHead = pointer;
        ListNode reverseEnd = pointer;
        pointer=pointer.next;
        ListNode nextNode;
        for(int i=m;i<n;i++){        	
        	nextNode=pointer.next;
        	pointer.next=reverseHead;
        	reverseHead=pointer;
        	pointer=nextNode;
        }
        reverseEnd.next=pointer;
        reversePre.next = reverseHead;        
        return newHead.next;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
