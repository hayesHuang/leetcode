package leetcode;

public class PartitionList {
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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        ListNode smallHead = new ListNode(Integer.MIN_VALUE);
        ListNode largeHead = new ListNode(Integer.MAX_VALUE);
        ListNode smallpointer = smallHead;
        ListNode largepointer = largeHead;
        ListNode pointer = head;
        while(pointer!=null){
        	if(pointer.val<x){
        		smallpointer.next=pointer;
        		smallpointer=smallpointer.next;
        	}else{
        		largepointer.next=pointer;
        		largepointer=largepointer.next;
        	}
        	pointer=pointer.next;
        }
        largepointer.next=null;
        smallHead=smallHead.next;
        largeHead=largeHead.next;
        if(smallHead!=null){
        	smallpointer.next=largeHead;
        	return smallHead;
        }else{
        	return largeHead;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next=new ListNode(1);
		PartitionList test = new PartitionList();
		test.partition(head, 2);
		System.out.println("end");

	}

}
