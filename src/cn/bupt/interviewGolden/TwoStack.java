package cn.bupt.interviewGolden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TwoStack {
	
	private Stack<Integer> stackPush=new Stack<Integer>();
	private Stack<Integer> stackPop=new Stack<Integer>();
	
	public static void main(String[] args) {
		int []ope={1,2,3,0,4,0};
		TwoStack twoStack=new TwoStack();
		System.out.println(Arrays.toString(twoStack.twoStack(ope, 6)));
	}
	
	 public int[] twoStack(int[] ope, int n) {
	        // write code here
		 List<Integer> list=new ArrayList<Integer>();
		 for(int op:ope){
			 if(op==0){
				 list.add(pop());
			 }else{
				 push(op);
			 }
		 }
		 int result[]=new int[list.size()];
		 for(int i=0;i<list.size();i++){
			 result[i]=list.get(i);
		 }
		 list=null;
		 return result;
	 }
	 
	 public void push(int data){
		 while(!stackPop.isEmpty()){
			 stackPush.add(stackPop.pop());
		 }
		 stackPush.add(data);
	 }
	 
	 public int pop(){
		 while(!stackPush.isEmpty()){
			 stackPop.add(stackPush.pop());
		 }
		 return stackPop.pop();
	 }
	 

}
