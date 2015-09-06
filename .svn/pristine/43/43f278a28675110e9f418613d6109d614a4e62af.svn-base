package leetcode;

public class SearchInsertPosition {
	private int insertPosition(int[] A, int start, int end, int target){
		int middle=(start+end)/2;
		if(A[middle]==target){
			return middle;
		}else if(A[middle]>target){
			if(middle==0||A[middle-1]<target){
				return middle;
			}else{
				return insertPosition(A,start,middle-1,target);
			}
		}else {
			if(middle==A.length-1||A[middle+1]>target){
				return middle+1;
			}else{
				return insertPosition(A,middle+1,end,target);
			}
		}
	}
    public int searchInsert(int[] A, int target) {
        if(A==null||A.length<=0) return -1;
        return insertPosition(A,0,A.length-1,target);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
