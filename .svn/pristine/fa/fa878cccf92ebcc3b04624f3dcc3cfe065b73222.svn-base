package leetcode;

public class MaximumProductSubarray {
    public int maxProduct(int[] A) {
    	if(A.length<=0) return 0;
    	int curMax = A[0];
    	int curMin = A[0];
    	int ans = A[0];
    	for(int i=1;i<A.length;i++){
    		int tmp=curMin;
    		curMin=Math.min(curMin*A[i], Math.min(curMax*A[i], A[i]));
    		curMax=Math.max(curMax*A[i], Math.max(tmp*A[i], A[i]));
    		ans=Math.max(ans, curMax);
    	}
    	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
