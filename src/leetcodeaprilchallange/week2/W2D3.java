package leetcodeaprilchallange.week2;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack. pop() -- Removes the element on top of
 * the stack. top() -- Get the top element. getMin() -- Retrieve the minimum
 * element in the stack.
 * 
 * 
 * 
 * Example:
 * 
 * MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
 * minStack.push(-3); minStack.getMin(); --> Returns -3. minStack.pop();
 * minStack.top(); --> Returns 0. minStack.getMin(); --> Returns -2.
 * 
 */
public class W2D3 {
	public static class MinStack {
		private Stack<Integer> stack;

	    /** initialize your data structure here. */
	    public MinStack() {
	    	stack = new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        stack.add(x);
	    }
	    
	    public void pop() {
	        stack.pop();
	    }
	    
	    public int top() {
	        return stack.lastElement();
	    }
	    
	    public int getMin() {
	        return getLimit(false);
	    }
	    private int getLimit(boolean isTop) {
	        int result = stack.get(0);
	        for(Integer i: stack) {
	        	if(isTop && i > result) {
	        		result = i;
	        	}
	        	if(!isTop && i < result) {
	        		result = i;
	        	}
	        }
	        return result;
	    	
	    }
	}

	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
}
