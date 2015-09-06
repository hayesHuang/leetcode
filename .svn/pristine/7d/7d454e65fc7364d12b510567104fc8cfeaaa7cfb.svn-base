package leetcode;

import java.util.List;

public class Triangle {	
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowCount = triangle.size();
        if (rowCount<1) return 0;
        int[] tmpPathSum = new int[rowCount];
        tmpPathSum[0]=triangle.get(0).get(0);
        for(int i=1;i<rowCount;i++){
        	List<Integer> row = triangle.get(i);
        	tmpPathSum[i]=row.get(i)+tmpPathSum[i-1];
        	for(int j=i-1;j>0;j--){
        		if(tmpPathSum[j]<tmpPathSum[j-1]){
        			tmpPathSum[j]=tmpPathSum[j]+row.get(j);
        		}else{
        			tmpPathSum[j]=tmpPathSum[j-1]+row.get(j);
        		}
        	}
        	tmpPathSum[0]=tmpPathSum[0]+row.get(0);
        }
        int minimum=tmpPathSum[0];
        for(int tmp:tmpPathSum){
        	if(tmp<minimum){
        		minimum=tmp;
        	}
        }
        return minimum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
