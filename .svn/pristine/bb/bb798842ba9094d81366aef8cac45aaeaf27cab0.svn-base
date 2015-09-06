package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if(n<0) return result;
        int size = (int) Math.pow(2, n);
        int[] sequence = new int[size];
        sequence[0]=0;
        int startIndex=1;
        for(int i=0;i<n;i++){
        	for(int j=0;j<startIndex;j++){
        		sequence[startIndex+j]=sequence[startIndex-j-1]+(1<<i);
        	}
        	startIndex=startIndex*2;
        }
        for(int i=0;i<sequence.length;i++){
        	result.add(sequence[i]);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrayCode test = new GrayCode();
		test.grayCode(1);

	}

}
