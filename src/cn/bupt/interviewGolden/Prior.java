package cn.bupt.interviewGolden;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prior {
	
	public static void main(String[] args) {
		Prior prior=new Prior();
		String strs[]={"abc","de"};
		System.out.println(prior.findSmallest(strs, 2));
	}
	
	public String findSmallest(String[] strs, int n) {
        // write code here
		PriorityQueue<String> priorityQueue=new PriorityQueue<String>(n,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o1+o2).compareTo(o2+o1);
			}
		});
		
		for(String s:strs){
			priorityQueue.add(s);
		}
		StringBuffer result=new StringBuffer();
		while(!priorityQueue.isEmpty()){
			result.append(priorityQueue.poll());
		}
		return result.toString();
		
    }

}
