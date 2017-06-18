package cn.bupt.interviewGolden;

import java.util.ArrayList;
import java.util.Stack;

public class TwoStacksSort {
	
	public static void main(String[] args) {
		TwoStacksSort twoStacksSort=new TwoStacksSort();
		int numbers[]={1,2,3,4,5};
		System.out.println(twoStacksSort.twoStacksSort(numbers));
	}
	
	public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=numbers.length-1;i>=0;i--){
			stack.add(numbers[i]);
		}
		Stack<Integer> help=new Stack<Integer>();
		while(!stack.isEmpty()){
			
			if(help.isEmpty()||stack.peek()<=help.peek()){
				help.add(stack.pop());
			}else{
				int remove=stack.pop();
				while(!help.isEmpty()&&help.peek()<remove){
					stack.add(help.pop());
				}
				help.add(remove);
			}
		}
		ArrayList<Integer> result=new ArrayList<Integer>();
		while(!help.isEmpty()){
			stack.add(help.pop());
		}
		while(!stack.isEmpty()){
			result.add(stack.pop());
		}
		return result;
		
    }

}
