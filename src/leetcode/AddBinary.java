package leetcode;



import java.util.ArrayList;
import java.util.Stack;

public class AddBinary {
	boolean carry=false;
	private char plus (char a, char b){
		if(a=='1'&&b=='1'){
			if(carry){
				return '1';
			}else{
				carry=true;
				return '0';
			}
		}else if(a=='1'||b=='1'){
			if(carry){
				return '0';
			}else{
				return '1';
			}
		}else{
			if(carry){
				carry=false;
				return '1';
			}else{
				return '0';
			}
		}
	}
	private char plus(char a){
		if(a=='1'){
			if(carry){
				return '0';
			}else{
				carry=false;
				return '1';
			}
		}else{
			if(carry){
				carry=false;
				return '1';
			}else{
				return '0';
			}
		}
	}
	public String addBinary(String a, String b) {
        Stack<Character> stackA = new Stack<Character>();
        for(char c:a.toCharArray()){
        	stackA.push(c);
        }
        Stack<Character> stackB = new Stack<Character>();
        for(char c:b.toCharArray()){
        	stackB.push(c);
        }
        Stack<Character> stackC = new Stack<Character>();
        
        while(!stackB.isEmpty()||!stackA.isEmpty()){
        	if(!stackA.isEmpty()&&!stackB.isEmpty()){
        		stackC.push(plus(stackA.pop(),stackB.pop()));
        	}else if(!stackA.isEmpty()){
        		stackC.push(plus(stackA.pop()));
        	}else{
        		stackC.push(plus(stackB.pop()));
        	}
        }
        if(carry){
        	stackC.push('1');
        }
        StringBuilder str= new StringBuilder();
        while(!stackC.isEmpty()){
        	str.append(stackC.pop());
        }
        return str.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
