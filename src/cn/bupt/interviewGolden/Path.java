package cn.bupt.interviewGolden;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Path {

	 public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
	        // write code here
		 return dfs(a,b)||dfs(b,a);
		
		 
	 }
	 
	 public boolean dfs(UndirectedGraphNode a, UndirectedGraphNode b){
		 Map<UndirectedGraphNode,Boolean> map=new HashMap<UndirectedGraphNode,Boolean>();
		 if(a==null||b==null)
			 return false;
		 if(a==b)
			 return true;
		 Queue<UndirectedGraphNode> queue=new LinkedList<UndirectedGraphNode>();
		 queue.add(a);
		 map.put(a, true);
		 while(!queue.isEmpty()){
			 UndirectedGraphNode temp=queue.poll();
			 ArrayList<UndirectedGraphNode> neighbors=temp.neighbors;
			 for(UndirectedGraphNode node:neighbors){
				 if(node==b)
					 return true;
				 if(map.get(node)==null||!map.get(node)){
					 map.put(node, true);
					 queue.add(node);
				 }
				 
			 }
		 }
		 return false;
	 }
	
}
