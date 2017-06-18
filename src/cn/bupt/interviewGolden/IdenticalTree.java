package cn.bupt.interviewGolden;

public class IdenticalTree {
	
	public static void main(String[] args) {
		IdenticalTree identicalTree=new IdenticalTree();
		TreeNode node1=new TreeNode(85);
		TreeNode node2=new TreeNode(33);
		TreeNode node3=new TreeNode(15);
		TreeNode node4=new TreeNode(18);
		TreeNode node5=new TreeNode(6);
		TreeNode node6=new TreeNode(12);
		TreeNode node7=new TreeNode(5);
		TreeNode node8=new TreeNode(23);
		TreeNode node9=new TreeNode(29);
		node1.left=node2;
		node1.right=node7;
		node2.left=node3;
		node2.right=node4;
		node4.left=node5;
		node4.right=node6;
		node7.left=node8;
		node7.right=node9;
		
		TreeNode node10=new TreeNode(33);
		TreeNode node11=new TreeNode(15);
		TreeNode node12=new TreeNode(18);
		TreeNode node13=new TreeNode(6);
		TreeNode node14=new TreeNode(12);
		node10.left=node11;
		node10.right=node12;
		node12.left=node13;
		node12.right=node14;
		
		/*System.out.println(identicalTree.getPreVisite(node1));
		System.out.println(identicalTree.getPreVisite(node10));*/
		System.out.println(identicalTree.chkIdentical(node2, node10));
		
		
	}
	
	public String getPreVisite(TreeNode root){
		if(root!=null){
			return String.valueOf(root.val)+","+getPreVisite(root.left)+","+getPreVisite(root.right)+",";
		}
		return "#";
	}
	
	public boolean chkIdentical(TreeNode A, TreeNode B) {
        // write code here
		String As=getPreVisite(A);
		String Bs=getPreVisite(B);
		return match(As, Bs);
		
    }
	
	public boolean match(String s,String pattern){
		int next[]=getNext(pattern);
		int j=0;
		int i=0;
		while(i<s.length()&&j<pattern.length()){
			if(j==-1||s.charAt(i)==pattern.charAt(j)){
				i++;
				j++;
			}else{
				j=next[j];
			}
		}
		if(j==pattern.length())
			return true;
		
		
		return false;
	}
	
	public int[] getNext(String pattern){
		int next[]=new int[pattern.length()];
		next[0]=-1;
		int j=0;
		int k=-1;
		while(j<next.length-1){
			if(k==-1||pattern.charAt(j)==pattern.charAt(k)){
				k++;
				j++;
				next[j]=k;
			}else{
				k=next[k];
			}
		}
		
		return next;
	}

}
