package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		if(numRows>0){
			List<Integer> line=new ArrayList<Integer>();
        	line.add(1);
        	result.add(line);
		}else{
			return result;
		}
        for(int j=1;j<numRows;j++){
        	List<Integer> line=new ArrayList<Integer>();
        	line.add(1);
        	for(int i=1;i<j;i++){
        		List<Integer>  lastLine=result.get(j-1);
        		line.add(lastLine.get(i-1)+lastLine.get(i));
        	}
        	line.add(1);
        	result.add(line);
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
