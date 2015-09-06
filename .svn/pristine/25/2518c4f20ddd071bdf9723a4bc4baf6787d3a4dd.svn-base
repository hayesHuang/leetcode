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
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long number1=0,number2=0;
        long weight=1;
        ListNode node=l1;
        while(node!=null){
        	number1=number1+weight*node.val;
        	weight=weight*10;
        	node=node.next;
        }
        node=l2;
        weight=1;
        while(node!=null){
        	number2=number2+weight*node.val;
        	weight=weight*10;
        	node=node.next;
        }
        long number=number1+number2;
        long remainder=number%10;
        ListNode head=new ListNode((int) remainder);
        node=head;
        number=number/10;
        while(number>0){
        	remainder=number%10;
        	node.next=new ListNode((int) remainder);
        	node=node.next;
        	number=number/10;
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(2);
		ListNode node=l1;
		node.next=new ListNode(4);
		node=node.next;
		new AddTwoNumbers().addTwoNumbers(l1, l1);

	}

}
