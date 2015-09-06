package leetcode;

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
    	if(n==0) {
    		return 0;
    	}else if(n==1){
    		return 1;
    	}else if(n==2){
    		return 2;
    	}else {
    		int[] numTypes = new int[n+1];
    		numTypes[0] = 1;
    		numTypes[1] = 1;
    		numTypes[2] = 2;
    		for(int i=3;i<=n;i++){
    			for(int j=0;j<i;j++){
    				numTypes[i]+= numTypes[j]*numTypes[i-1-j];
    			}
    		}
    		return numTypes[n];
    	}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
