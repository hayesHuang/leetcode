package leetcode;

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix==null||matrix.length<1||matrix[0].length<1) return false;
    	int m=matrix.length;
    	int n=matrix[0].length;
    	int row=-1;
    	int startRow=0,endRow=matrix.length-1;
    	while(startRow<endRow){
    		int mid = startRow+((endRow-startRow+1)>>1);
    		if(matrix[mid][0]==target){
    			return true;
    		}else if(matrix[mid][0]<target){
    			startRow = mid;
    		}else{
    			endRow=mid-1;
    		}
    	}
    	int rowNum = startRow;
    	int startCol=0,endCol=matrix[rowNum].length-1;
    	while(startCol<=endCol){
    		int mid = startCol+((endCol-startCol)>>1);
    		if(matrix[rowNum][mid]==target){
    			return true;
    		}else if(matrix[rowNum][mid]<target){
    			startCol=mid+1;
    		}else {
    			endCol=mid-1;
    		}
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
