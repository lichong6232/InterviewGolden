package cn.bupt.interviewGolden;

import java.util.ArrayList;
import java.util.List;

public class TreeLevel {

	private List<TreeNode> list=new ArrayList<TreeNode>();
	
	public static void main(String[] args) {
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
		TreeLevel treeLevel=new TreeLevel();
		System.out.println(treeLevel.list.size());
		ListNode root=treeLevel.getTreeLevel(node3, 5);
		treeLevel.outPut(root);
		
	}
	public void outPut(ListNode root){
		ListNode curr=root;
		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
	}
	
	public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
		listNodeList(root, 1, dep);
		if(list.size()==0)
			return null;
		ListNode head=new ListNode(list.remove(0).val);
		ListNode curr=head;
		for(TreeNode node:list){
			curr.next=new ListNode(node.val);
			curr=curr.next;
		}
		return head;
    }
	public void listNodeList(TreeNode root,int nowDep,int targetDep){
		if(root==null)
			return;
		if(nowDep==targetDep)
			list.add(root);
		else{
			listNodeList(root.left, nowDep+1, targetDep);
			listNodeList(root.right, nowDep+1, targetDep);
		}
		
	}
	
}
