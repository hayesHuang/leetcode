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
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
    	if(head==null||head.next==null) return head;
    	ListNode nodeFront=head;
    	ListNode nodeBack=head.next;
        nodeFront.next=nodeBack.next;
    	head=nodeBack;
    	nodeBack.next=nodeFront;
    	ListNode prePointer=nodeFront;
    	while(prePointer.next!=null){
    		if(prePointer.next.next!=null){
    			nodeFront=prePointer.next;
    			nodeBack=prePointer.next.next;
    			prePointer.next=nodeBack;
    			nodeFront.next=nodeBack.next;
    			nodeBack.next=nodeFront;
        		prePointer=nodeFront;
    		}else{
    			break;
    		}
    	}   	
    	return head;
        
    }
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		SwapNodesinPairs sw = new SwapNodesinPairs();
//		head=head.next.next;
		System.out.println(sw.swapPairs(head).val);
		// TODO Auto-generated method stub

	}

}
