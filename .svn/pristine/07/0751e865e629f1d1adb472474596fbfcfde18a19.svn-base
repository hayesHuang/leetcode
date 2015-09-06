package leetcode;

public class FindMinimuminRotatedSortedArray {
	private int findMin(int[] num, int start, int end){
		if(end-start<=1){
			if(num[start]<num[end]){
				return num[start];
			}else{
				return num[end];
			}
		}else{
			int mid=(start+end)/2;
			if(num[start]<num[mid]&&num[mid]<num[end]){
				return num[start];
			}else if(num[start]<num[mid]){
				return findMin(num, mid,end);
			}else{
				return findMin(num,start,mid);
			}
		}
	}
    public int findMin(int[] num) {
    	return findMin(num,0,num.length-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
