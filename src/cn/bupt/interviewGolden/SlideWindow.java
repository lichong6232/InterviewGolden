package cn.bupt.interviewGolden;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlideWindow {
	
	public static void main(String[] args) {
		SlideWindow slideWindow=new SlideWindow();
		int arr[]={4,3,5,4,3,3,6,7};
		int result[]=slideWindow.slide(arr, 8, 3);
		System.out.println(Arrays.toString(result));
	}
	
	public int[] slide(int[] arr, int n, int w) {
        // write code here
		Deque<Integer> deque=new LinkedList<Integer>();
		int result[]=new int[n-w+1];
		for(int i=0;i<n;i++){
			
			while(!deque.isEmpty()&&arr[deque.getLast()]<=arr[i]){
				deque.removeLast();
			}
			if(!deque.isEmpty()&&deque.getFirst()<i-w+1){
				deque.removeFirst();
			}
				
			deque.addLast(i);
			if(i<w-1)
				continue;
			result[i-w+1]=arr[deque.getFirst()];
		}
		return result;
    }

}
