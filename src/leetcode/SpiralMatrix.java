package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	private void circle(List<Integer> list,int[][] matrix,int start_i, int start_j,int end_i,int end_j){
		if(start_i==end_i-1){
			for(int j=start_j;j<end_j;j++){
				list.add(matrix[start_i][j]);
			}
		}else if(start_j==end_j-1){
			for(int i=start_i;i<end_i;i++){
				list.add(matrix[i][start_j]);
			}
		}else{
			for(int j=start_j;j<end_j;j++){
				list.add(matrix[start_i][j]);
			}
			for(int i=start_i+1;i<end_i;i++){
				list.add(matrix[i][end_j-1]);
			}
			for(int j=end_j-2;j>=start_j;j--){
				list.add(matrix[end_i-1][j]);
			}
			for(int i=end_i-2;i>start_i;i--){
				list.add(matrix[i][start_j]);
			}
		}
		
	}
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> list = new ArrayList<Integer>();
    	if(matrix==null||matrix.length<=0||matrix[0].length<=0){
    		return list;
    	}
    	int start_i=0,end_i=matrix.length,start_j=0,end_j=matrix[0].length;
    	while(start_i<end_i&&start_j<end_j){
    		circle(list,matrix,start_i,start_j,end_i,end_j);
    		start_i++;
    		start_j++;
    		end_i--;
    		end_j--;
    	}
    	return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
