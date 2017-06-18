package cn.bupt.interviewGolden;

import java.util.ArrayList;

public class FindPath {

	 public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	  
		 ArrayList<ArrayList<Integer>> path=new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> temp=new ArrayList<Integer>();
		 getPath(root, temp, path, target);
		 return path;
	 }
	 
	 public void getPath(TreeNode root,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> path,int target){
		 if(root==null)
			 return;
		 target-=root.val;
		 temp.add(root.val);
		 if(target==0&&root.left==null&&root.right==null){
			 path.add(new ArrayList<Integer>(temp));
		 }else{
			 getPath(root.left, temp, path, target);
			 getPath(root.right, temp, path, target);
			 
		 } 
		 temp.remove(temp.size()-1);
	 }
}
