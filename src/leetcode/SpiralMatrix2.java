package leetcode;

public class SpiralMatrix2 {
	private int num=1;
	private void circle(int[][] matrix, int start_i,int end_i){
		if(start_i==end_i){
			matrix[start_i][start_i]=num;
			num++;
		}else{
			for(int i=start_i;i<=end_i;i++){
				matrix[start_i][i]=num;
				num++;
			}
			for(int i=start_i+1;i<=end_i;i++){
				matrix[i][end_i]=num;
				num++;
			}
			for(int i=end_i-1;i>=start_i;i--){
				matrix[end_i][i]=num;
				num++;
			}
			for(int i=end_i-1;i>start_i;i--){
				matrix[i][start_i]=num;
				num++;
			}
		}
		
	}
	
    public int[][] generateMatrix(int n) {
    	if(n<0) return null;
        int[][] matrix=new int[n][n];
        int start=0,end=n-1;
        while(start<=end){
        	circle(matrix,start,end);
        	start++;
        	end--;
        }
        return matrix;
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
