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
//方法1递归，如下代码，方法2建一个辅助节点，对于可能改变头指针的链表通常可以采用此方法。
public class RemoveDuplicatesfromSortedList2 {
	private ListNode getUnique(ListNode head){
		if(head==null) return null;
		if(head.next==null) return head;
		ListNode pointer = head;
		ListNode next = head.next;
		if(pointer.val!=next.val){
			head=pointer;
			pointer.next=getUnique(next);
			return head;
		}else{
			next=next.next;
			while(next!=null&&next.val==pointer.val){
				next=next.next;
			}
			if(next==null){
				return null;
			}else{
				return getUnique(next);
			}
			
		}
	}
    public ListNode deleteDuplicates(ListNode head) {
    	return getUnique(head);
  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
