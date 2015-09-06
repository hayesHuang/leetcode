package leetcode;

public class Sqrt {
    public int sqrt(int x) {
    	if(x<1) return 0;
        int right=x;
        int left=1;
        int mid = left+((right-left)>>1);
    	while(left<mid){
    		int tmp=x/mid;
    		if(mid==tmp){
    			return mid;
    		}else if(mid<tmp){
    			left = mid;
    		}else{
    			right=mid;
    		}
    		mid=left+((right-left)>>1);
    	}
    	return mid;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrt test = new Sqrt();
		test.sqrt(1);

	}

}
