package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
	
	
	 public List<Integer> getRow(int rowIndex) {
		 List<Integer> line=new ArrayList<Integer>();
	     if(rowIndex<0){
	    	 return line;
	     }else if(rowIndex==0){
	    	 line.add(1);
	    	 return line;
	     }else {
	    	 line.add(1);
	    	 line.add(1);
	    	 for(int j=1;j<=rowIndex;j++){
	    		 List<Integer> lastLine=line;
	    		 line=new ArrayList<Integer>();
	    		 line.add(1);
	    		 for(int i=1;i<j;i++){
	    			 line.add(lastLine.get(i-1)+lastLine.get(i));
	    		 }
	    		 line.add(1);
	    	 }
	    	 return line;
	     }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
