package cn.bupt.interviewGolden;

import java.util.Stack;

public class Successor {
	
	public static void main(String[] args) {
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6=new TreeNode(6);
		TreeNode node7=new TreeNode(7);
		node3.left=node2;
		node3.right=node4;
		node2.left=node1;
		node2.right=node7;
		node4.right=node5;
		node5.right=node6;
		Successor successor=new Successor();
		System.out.println(successor.findSucc(node3, 7));
	}

	 public int findSucc(TreeNode root, int p) {
	        // write code here
		 if(root==null)
			 return -1;
		 Stack<TreeNode> stack=new Stack<TreeNode>();
		 TreeNode curr=root;
		 boolean tag=false;
		 while(curr!=null){
			 stack.add(curr);
			 curr=curr.left;
			 while(curr==null&&!stack.isEmpty()){
				 TreeNode temp=stack.pop();
				 if(tag){
					 return temp.val;
				 }
				 if(temp.val==p){
					 tag=true;
				 }
				 
				 curr=temp.right;
			 }
		 }
		 return -1;
		 
	 }
	 
	
	
}
