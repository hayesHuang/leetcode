package leetcode;

import java.util.Stack;

public class ImplementQueueusingStacks {
    // Push element x to the back of queue.
	Stack<Integer> inStack=new Stack<Integer>();
	Stack<Integer> outStack=new Stack<Integer>();
    public void push(int x) {
        inStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(outStack.isEmpty()){
        	while(!inStack.isEmpty()){
        		outStack.push(inStack.pop());
        	}
        }
        outStack.pop();
    }

    // Get the front element.
    public int peek() {
    	if(outStack.isEmpty()){
        	while(!inStack.isEmpty()){
        		outStack.push(inStack.pop());
        	}
        }
    	return outStack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	if(outStack.isEmpty()){
        	while(!inStack.isEmpty()){
        		outStack.push(inStack.pop());
        	}
        }
    	return outStack.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
