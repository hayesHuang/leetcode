package leetcode;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
       if(matrix==null) return;
       int m=matrix.length;
       if(m<1) return;
       int n=matrix[0].length;
       if(n<1) return;
       boolean col0to0 = false;
       for(int i=0;i<m;i++){
    	   if(matrix[i][0]==0){
    		   col0to0 = true;
    		   break;
    	   }
       }
       boolean row0to0 = false;
       for(int j=0;j<n;j++){
    	   if(matrix[0][j]==0){
    		   row0to0 = true;
    		   break;
    	   }
       }
       
       for(int i=1;i<m;i++){
    	   for(int j=1;j<n;j++){
    		   if(matrix[i][j]==0){
    			   matrix[i][0]=0;
    			   matrix[0][j]=0;
    		   }
    	   }
       }
       for(int i=1;i<m;i++){
    	   if(matrix[i][0]==0){
    		   for(int j=1;j<n;j++){
    			   matrix[i][j]=0;
    		   }
    	   }
       }
       for(int j=1;j<n;j++){
    	   if(matrix[0][j]==0){
    		   for(int i=1;i<m;i++){
    			   matrix[i][j]=0;
    		   }
    	   }
       }
       if(col0to0){
    	   for(int i=0;i<m;i++){
    		   matrix[i][0]=0;
    	   }
       }
       if(row0to0){
    	   for(int j=0;j<n;j++){
    		   matrix[0][j]=0;
    	   }
       }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
