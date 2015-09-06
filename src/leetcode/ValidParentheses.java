package leetcode;

import java.util.Stack;

public class ValidParentheses {
	public boolean match(char a, char b){
		if(a=='{'&&b=='}'){
			return true;
		}else if(a=='['&&b==']'){
			return true;
		}else if(a=='('&&b==')'){
			return true;
		}else{
			return false;
		}
	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
	    for(char c:s.toCharArray()){
	    	if(stack.empty()){
	    		stack.push(c);
	    	}else{
	    		if(match(stack.peek(),c)){
	    			stack.pop();
	    		}else{
	    			stack.push(c);
	    		}
	    	}
	    }
	    if(stack.empty()){
	    	return true;
	    }else{
	    	return false;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
