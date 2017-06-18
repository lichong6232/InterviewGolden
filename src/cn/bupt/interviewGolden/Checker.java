package cn.bupt.interviewGolden;

import java.util.Stack;

public class Checker {
	
	public static void main(String[] args) {
		/*TreeNode node4=new TreeNode(4);
		TreeNode node2=new TreeNode(2);
		TreeNode node6=new TreeNode(6);
		TreeNode node1=new TreeNode(1);
		TreeNode node5=new TreeNode(5);
		TreeNode node3=new TreeNode(3);
		node4.left=node2;
		node4.right=node6;
		node2.left=node1;
		node2.right=node5;
		node6.left=node3;*/
		
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6=new TreeNode(6);
		node3.left=node2;
		node3.right=node4;
		node2.left=node1;
		node4.right=node5;
		node5.right=node6;
		
		Checker checker=new Checker();
		System.out.println(checker.checkBST(node3));
	}
	Stack<Integer> stack=new Stack<Integer>();
	
	 public boolean checkBST(TreeNode root) {
	        // write code here
		 
//		 if(root==null)
//			 return false;
//		 if(root.left==null&&root.right==null)
//			 return true;
//		 else if(root.left!=null&&root.right!=null){
//			 return root.left.val<root.val&&root.right.val>root.val&&checkBST(root.left)&&checkBST(root.right);
//			 
//		 }else if(root.left!=null){
//			 return root.left.val<root.val&&checkBST(root.left);
//		 }else{
//			 return root.right.val>root.val&&checkBST(root.right);
//		 }
		 if(root!=null){
			 boolean temp=checkBST(root.left);
			 if(!temp)
				 return false;
			 if(stack.size()>0){
				 if(root.val<stack.peek())
					 return false;
			 }
			 stack.push(root.val);
			 return checkBST(root.right);
		 }
		 return true;
		 
		 
	 }

}
