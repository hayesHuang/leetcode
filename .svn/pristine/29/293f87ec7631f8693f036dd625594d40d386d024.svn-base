package leetcode;

/**
 * Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
    	 val = x;
    	 next = null;
     }
 }

public class RemoveNthNodeFromEndofList {
	private int removeFromEnd(ListNode node, int n){
		int nTh;
		if(node.next==null){
			nTh= 1;
		}else{
			nTh=removeFromEnd(node.next, n)+1;
		}
		if(nTh==n+1){
			node.next=node.next.next;
		}
		return nTh;
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(removeFromEnd(head,n)==n){
			return head.next;
		}else{
			return head;
		}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
