package leetcode;

public class SearchinRotatedSortedArray {
	private int sortedSearch(int[] A, int begin, int end, int target ){
		if(begin>end||target>A[end]||target<A[begin]) return -1;
		int mid=begin+((end-begin)>>1);
		if(A[mid]==target){
			return mid;
		}else if(A[mid]<target){
			return sortedSearch(A,mid+1,end,target);
		}else{
			return sortedSearch(A,begin,mid-1,target);
		}
		
	}
	private int rotatedSearch(int[] A, int begin, int end, int target){
		if(begin>end) return -1;
		if(end-begin<2){
			if(A[begin]==target) return begin;
			if(A[end]==target) return end;
			return -1;
		}
		int mid=begin+((end-begin)>>1);
		if(A[begin]<A[mid]&&A[mid]<A[end]){
			return sortedSearch(A,begin,end,target);
		}
		if(A[begin]<A[mid]&&A[mid]>A[end]){
			if(target>=A[begin]&&target<=A[mid]){
				return sortedSearch(A,begin,mid,target);
			}else{
				return rotatedSearch(A,mid+1,end,target);
			}
		}
		if(A[begin]>A[mid]&&A[mid]<A[end]){
			if(target>=A[mid]&&target<=A[end]){
				return sortedSearch(A,mid,end,target);
			}else{
				return rotatedSearch(A,begin,mid-1,target);
			}
		}
		return -1;
	}
    public int search(int[] A, int target) {
        return rotatedSearch(A,0,A.length-1,target);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
