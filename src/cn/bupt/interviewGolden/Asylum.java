package cn.bupt.interviewGolden;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Asylum {
	
	public static void main(String[] args) {
		
		int ope[][]={{1,1},
					{1,-1},
					{2,0},
					{2,-1}};
		Asylum asylum=new Asylum();
		System.out.println(asylum.asylum(ope));
	}
	
	 public ArrayList<Integer> asylum(int[][] ope) {
	        // write code here
		 ArrayList<Integer> result=new ArrayList<Integer>();
		 
		 Queue<Integer> queue=new LinkedList<Integer>();
		 Queue<Integer> dog=new LinkedList<Integer>();
		 Queue<Integer> cat=new LinkedList<Integer>();
		 for(int i=0;i<ope.length;i++){
			 int type=ope[i][1];
			 if(ope[i][0]==1){
				 
				 queue.add(type);
				 if(type>0)
					 dog.add(type);
				 else
					 cat.add(type);
			 }else{
				 if(type==0){
					 if(queue.size()>0){
						 Integer remove=queue.poll();
						 result.add(remove);
						 dog.remove(remove);
						 cat.remove(remove);
					 }
				 }else if(type==1){
					 if(dog.size()>0){
						 Integer remove=dog.poll();
						 result.add(remove);
						 queue.remove(remove);
					 }
				 }else{
					 if(cat.size()>0){
						 Integer remove=cat.poll();
						 result.add(remove);
						 queue.remove(remove);
					 }
						 
				 }
			 }
		 }
		 
		 return result;
	 }

}
