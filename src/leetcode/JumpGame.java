package leetcode;

public class JumpGame {
    public boolean canJump(int[] A) {
    	if(A==null||A.length<=0) return false;
    	if(A.length==1) return true;
    	int maxStep=A[0];
    	for(int i=1;i<A.length;i++){
    		if(maxStep==0) return false;
    		maxStep--;
    		maxStep=Math.max(maxStep, A[i]);
    		if(i+maxStep>=A.length-1) return true;
    		
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGame  test = new JumpGame();
		int[] A ={1,2,2,6,3,6,1,8,9,4,7,6,5,6,8,2,6,1,3,6,6,6,3,2,4,9,4,5,9,8,2,2,1,6,1,6,2,2,6,1,8,6,8,3,2,8,5,8,0,1,4,8,7,9,0,3,9,4,8,0,2,2,5,5,8,6,3,1,0,2,4,9,8,4,4,2,3,2,2,5,5,9,3,2,8,5,8,9,1,6,2,5,9,9,3,9,7,6,0,7,8,7,8,8,3,5,0};
		int[] B ={1,2,3,4,5};
		

	}

}
