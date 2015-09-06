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

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1=l1;
        ListNode node2=l2;
        ListNode head,pointer;
        
        if(node1!=null&&node2!=null){
        	if(node1.val<node2.val){
        		head=node1;
        		node1=node1.next;
        	}else{
        		head=node2;
        		node2=node2.next;
        	}
        	pointer=head;
        }else if(node1!=null){
        	return node1;
        }else{
        	return node2;
        }
        
        while(node1!=null&&node2!=null){
        	if(node1.val<node2.val){
        		pointer.next=node1;
        		pointer=node1;
        		node1=node1.next;
        	}else{
        		pointer.next=node2;
        		pointer=node2;
        		node2=node2.next;
        	}
        }
        if(node1!=null){
        	pointer.next=node1;
        }else{
        	pointer.next=node2;
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
