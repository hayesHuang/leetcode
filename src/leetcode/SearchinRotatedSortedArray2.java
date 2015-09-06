package leetcode;

public class SearchinRotatedSortedArray2 {
	private boolean sortedSearch(int[] A, int begin, int end, int target ){
		if(begin>end||target>A[end]||target<A[begin]) return false;
		int mid=begin+((end-begin)>>1);
		if(A[mid]==target){
			return true;
		}else if(A[mid]<target){
			return sortedSearch(A,mid+1,end,target);
		}else{
			return sortedSearch(A,begin,mid-1,target);
		}
		
	}
	private boolean rotatedSearch(int[] A, int begin, int end, int target){
		if(begin>end) return false;
		if(end-begin<2){
			if(A[begin]==target||A[end]==target) {
				return true;
			}else{
				return false;
			}

		}
		int mid=begin+((end-begin)>>1);
		if(A[begin]==A[mid]&&A[mid]==A[end]){
			if(A[mid]==target){
				return true;
			}else{
				return rotatedSearch(A,begin,mid,target)||rotatedSearch(A,mid+1,end,target);
			}
		}
		if(A[begin]<=A[mid]&&A[mid]<=A[end]){
			return sortedSearch(A,begin,end,target);
		}
		if(A[begin]<=A[mid]&&A[mid]>=A[end]){
			if(target>=A[begin]&&target<=A[mid]){
				return sortedSearch(A,begin,mid,target);
			}else{
				return rotatedSearch(A,mid+1,end,target);
			}
		}
		if(A[begin]>=A[mid]&&A[mid]<=A[end]){
			if(target>=A[mid]&&target<=A[end]){
				return sortedSearch(A,mid,end,target);
			}else{
				return rotatedSearch(A,begin,mid-1,target);
			}
		}
		return false;
	}
    public boolean search(int[] A, int target) {
        return rotatedSearch(A,0,A.length-1,target);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchinRotatedSortedArray2 test = new SearchinRotatedSortedArray2();
		int[] A = new int[]{1,1,3,1};
		int target = 3;
		test.search(A, target);

	}

}
