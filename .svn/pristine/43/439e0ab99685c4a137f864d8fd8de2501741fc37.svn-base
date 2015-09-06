package leetcode;

public class SearchforaRange {
	private int firstIndex(int[] A, int start, int end, int target){
		int middle = (start+end)/2;
		if(start>end) return -1;
		if(A[middle]==target&&(middle==0||A[middle-1]!=target)){
			return middle;
		}else if(A[middle]<target){
			return firstIndex(A,middle+1,end,target);
		}else{
			return firstIndex(A,start,middle-1,target);
		}
	}
	private int lastIndex(int[] A, int start, int end, int target){
		int middle = (start+end)/2;
		if(start>end) return -1;
		if(A[middle]==target&&(middle==A.length-1||A[middle+1]!=target)){
			return middle;
		}else if(A[middle]>target){
			return lastIndex(A,start,middle-1,target);
		}else {
			return lastIndex(A,middle+1,end,target);
		}
	}
    public int[] searchRange(int[] A, int target) {
    	int[] res = new int[]{-1,-1};
        if(A==null||A.length<=0) return res;
        int startIndex = firstIndex(A,0,A.length-1,target);
        int endIndex= lastIndex(A,0,A.length-1,target);
        if(startIndex!=-1&&endIndex!=-1){
        	res[0] = startIndex;
        	res[1] = endIndex;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
