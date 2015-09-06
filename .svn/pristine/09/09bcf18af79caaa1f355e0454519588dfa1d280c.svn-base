package leetcode;

public class MaximumSubarray {
    public int maxSubArray(int[] A) {
        if(A==null||A.length<=0){
        	return 0;
        }
        int tmpSum=0;
        int maxSum=A[0];
        for(int a:A){
        	tmpSum+=a;
        	if(tmpSum>maxSum) maxSum=tmpSum;
        	if(tmpSum<0) tmpSum=0;
        }
        return maxSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
