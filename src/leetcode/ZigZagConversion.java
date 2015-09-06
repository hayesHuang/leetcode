package leetcode;

import java.util.ArrayList;

public class ZigZagConversion {
	private int totalRows;
	private int lineNum;
	private boolean increase=false;
	private int changeNum(boolean increase){
		if(increase){
			return lineNum++;
		}else{
			return lineNum--;
		}
	}
	private int nextLineNum(){
		if(lineNum==totalRows-1||lineNum==0){
			increase=!increase;
			return changeNum(increase);
		}else{
			return changeNum(increase);
		}
	}
	public String convert(String s, int nRows) {
		if(nRows==1) return s;
		totalRows=nRows;
		lineNum=0;
	    ArrayList<ArrayList<Character>> lines= new ArrayList<ArrayList<Character>>();
	    for(int i=0;i<nRows;i++){
	    	lines.add(new ArrayList<Character>());
	    }
	    for(char c:s.toCharArray()){
	    	lines.get(nextLineNum()).add(c);
	    }
	    StringBuilder result=new StringBuilder();
	    for(ArrayList<Character> line:lines){
	    	for(char c:line){
	    		result.append(c);
	    	}
	    }
	    return result.toString();
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ZigZagConversion().convert("AB", 2));
	}

}
