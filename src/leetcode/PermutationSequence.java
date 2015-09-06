package leetcode;

import java.util.LinkedList;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
    	StringBuilder str = new StringBuilder();
    	int seqTotal=1;
    	LinkedList<Integer> restNum = new LinkedList<Integer>();
    	for(int i=1;i<=n;i++){
    		seqTotal*=i;
    		restNum.add(i);
    	}
    	k--;
    	for(int i=0;i<n;i++){
    		 seqTotal/=(n-i);
    		 int numPosition=k/seqTotal;
    		 str.append(restNum.get(numPosition));
    		 restNum.remove(numPosition);
    		 k=k%seqTotal;
    	}
        return str.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
