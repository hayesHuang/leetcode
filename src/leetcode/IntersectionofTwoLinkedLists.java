package leetcode;

public class IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=0;
        ListNode nodeA=headA;
        while(nodeA!=null){
        	lenA++;
        	nodeA=nodeA.next;
        }
        ListNode nodeB=headB;
        while(nodeB!=null){
        	lenB++;
        	nodeB=nodeB.next;
        }
        nodeA=headA;
        nodeB=headB;
        if(lenA>lenB){
        	int lendiff = lenA-lenB;
        	for(int i=lendiff; i>0;i--){
        		nodeA=nodeA.next;
        	}
        }else{
        	int lendiff = lenB-lenA;
        	for(int i=lendiff;i>0;i--){
        		nodeB=nodeB.next;
        	}
        }
        while(nodeA!=null){
        	if(nodeA==nodeB){
        		return nodeA;
        	}else{
        		nodeA=nodeA.next;
        		nodeB=nodeB.next;
        	}
        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
