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
public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
    	if(head==null||n<=0) return head;
        int len=1;
        ListNode end = head;
        while(end.next!=null){
        	len++;
        	end=end.next;
        }
        end.next=head;
        int k = len-n%len;
        if(k==len) k=0;
        while(k>0){
        	k--;
        	head=head.next;
        	end=end.next;
        }
        end.next=null;
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
