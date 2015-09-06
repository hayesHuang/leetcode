package leetcode;

import java.util.Vector;

class MinStack {
	Vector<Integer> stack=new Vector<Integer>();
	Vector<Integer> min=new Vector<Integer>();
    public void push(int x) {
        if(stack.size()==0||x<=min.lastElement()){
        	min.add(x);
        }
        stack.add(x);
    }

    public void pop() {
       
        if(stack.lastElement().equals(min.lastElement())){
        	min.remove(min.size()-1);
        }
        	
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.lastElement();
    }

    public int getMin() {
        return min.lastElement();
    }
}


