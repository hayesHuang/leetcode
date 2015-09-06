package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
	List<String> res;
    public List<String> generateParenthesis(int n) {
    	res= new ArrayList<String>();
        appendParenthesis("",n,0);
        return res;
    }
    private void appendParenthesis(String str,int front,int back){
    	if(front==0&&back==0){
    		res.add(str);
    	}else{
    		if(front!=0){
    			appendParenthesis(str+"(",front-1,back+1);
    		}
    		if(back!=0){
    			appendParenthesis(str+")",front,back-1);
   			
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
