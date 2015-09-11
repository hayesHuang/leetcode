package leetcode;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        int len=0;
        ListNode node=head;
        while(node!=null){
        	len++;
        	node=node.next;
        }
        if(len%2==0){
        	int half=len/2;
        	Stack<ListNode> stack = new Stack<ListNode>();
        	node=head;
        	for(int i=0;i<half;i++){
        		stack.push(node);
        		node=node.next;
        	}
        	for(int i=half;i<len;i++){
        		ListNode ahead= stack.pop();
        		if(ahead.val!=node.val) return false;
        		node=node.next;
        	}
        	return true;
        }else{
        	int half=(len-1)/2;
        	Stack<ListNode> stack = new Stack<ListNode>();
        	node=head;
        	for(int i=0;i<half;i++){
        		stack.push(node);
        		node=node.next;
        	}
        	node=node.next;
        	for(int i=half+1;i<len;i++){
        		ListNode ahead= stack.pop();
        		if(ahead.val!=node.val) return false;
        		node=node.next;
        	}
        	return true;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
