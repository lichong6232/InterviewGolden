package cn.bupt.interviewGolden;

public class MinimalBST {
	
	public static void main(String[] args) {
		int vals[]={1,2,3,4};
		MinimalBST minimalBST=new MinimalBST();
		System.out.println(minimalBST.buildMinimalBST(vals));
	}
	
	 public int buildMinimalBST(int[] vals) {
	        // write code here
		 return depth(buildTree(vals, 0,vals.length-1));
	 }
	 
	 public int depth(TreeNode root){
		 if(root==null)
			 return 0;
		 return 1+Math.max(depth(root.left), depth(root.right));
	 }
	 
	 public TreeNode buildTree(int []vals,int left,int rifht){
		 if(left>rifht)
			 return null;
		 int mid=(left+rifht)>>1;
		 TreeNode root=new TreeNode(vals[mid]);
		 root.left=buildTree(vals, left,mid-1);
		 root.left=buildTree(vals, mid+1,rifht);
		 return root;
		 
	 }

}
