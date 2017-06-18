package cn.bupt.interviewGolden;

import java.util.Stack;

public class StackMin {
	
	Stack<Integer> stackData=new Stack<Integer>();
	Stack<Integer> stackMin=new Stack<Integer>();
	
	 public void push(int node) {
	        stackData.add(node);
	        if(stackMin.isEmpty()||stackMin.peek()>=node){
	        	stackMin.add(node);
	        }
    }
    
    public void pop() {
    	
    	if(stackMin.peek()==stackData.peek())
    		stackMin.pop();
    	stackData.pop();
        
    }
    
    public int top() {
    	return stackData.peek();
    }
    
    public int min() {
        return stackMin.peek();
    }

}
