package cn.bupt.interviewGolden;

import java.util.Arrays;
import java.util.Stack;

public class StackReverse {
	
	public static void main(String[] args) {
		StackReverse stackReverse=new StackReverse();
		int A[]={4,3,2,1};
		System.out.println(Arrays.toString(stackReverse.reverseStack(A, 4)));
		
	}
	
	
	 public int[] reverseStack(int[] A, int n) {
	        // write code here
		 Stack<Integer> stack=new Stack<Integer>();
		 for(int i=A.length-1;i>=0;i--){
			 stack.add(A[i]);
		 }
		 reverse(stack);
		 int i=0;
		 while(!stack.isEmpty()){
			 A[i]=stack.pop();
			 i++;
		 }
		 return A;
	 }
	 
	 public void reverse(Stack<Integer> stack){
		 if(stack.isEmpty())
			 return ;
		 int i=get(stack);
		 reverse(stack);
		 stack.add(i);
		 
	 }
	
	public int get(Stack<Integer> stack){
		int result=stack.pop();
		if(stack.isEmpty())
			return result;
		int i=get(stack);
		stack.add(result);
		return i;
		
	}

}
