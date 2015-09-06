package leetcode;

public class RotateImage {
	private void rotate(int n,int i,int j, int[][] matrix){
		int tmp=matrix[n-1-j][i];
		matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
		matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
		matrix[j][n-1-i]=matrix[i][j];
		matrix[i][j]=tmp;
	}
    public void rotate(int[][] matrix) {
        if(matrix==null||matrix.length<=0) return;
        int n=matrix.length;
        if((n&1)==0){
        	int halfLength=(n)/2;
            for(int i=0;i<halfLength;i++){
            	for(int j=0;j<halfLength;j++){
            		rotate(n,i,j,matrix);
            	}
            }
        }else{
        	int halfLength=(n+1)/2;
            for(int i=0;i<halfLength-1;i++){
            	for(int j=0;j<halfLength;j++){
            		rotate(n,i,j,matrix);
            	}
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
