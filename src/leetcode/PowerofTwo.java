package leetcode;

public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
    	if(n<1) return false;
        while(n>1){
        	if(n%2==0){
        		n/=2;
        	}else{
        		return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
