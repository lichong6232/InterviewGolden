package cn.bupt.interviewGolden;


public class IsBalance {
	
	
	 public boolean isBalance(TreeNode root) {
	        // write code here
		 if(root==null)
			 return true;
		 return Math.abs(depth(root.left)-depth(root.right))<2&&isBalance(root.left)&&isBalance(root.right);
	 }
	
	public int depth(TreeNode root){
		if(root==null)
			return 0;
		return 1+Math.max(depth(root.left), depth(root.right));
	}

}
