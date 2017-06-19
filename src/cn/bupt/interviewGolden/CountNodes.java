package cn.bupt.interviewGolden;

public class CountNodes {
	
	public static void main(String[] args) {
		TreeNode node0=new TreeNode(0);
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		node0.left=node1;
		node0.right=node2;
		CountNodes countNodes=new CountNodes();
		System.out.println(countNodes.count(node0));
	}
	
	 public int count(TreeNode root) {
	        // write code here
		 if(root==null)
			 return 0;
		 int leftChildLayer=layer(root.left);
		 int rightChildLayer=layer(root.right);
		 if(leftChildLayer==rightChildLayer){
			 return (int) (Math.pow(2, leftChildLayer)+count(root.right));
		 }else{
			 return (int) (Math.pow(2, rightChildLayer)+count(root.left));
		 }
	 }
	 
	 public int layer(TreeNode root){
		 int layer=0;
		 TreeNode node=root;
		 while(node!=null){
			 layer++;
			 node=node.left;
		 }
		 return layer;
		 
	 }
	 
	 

}
