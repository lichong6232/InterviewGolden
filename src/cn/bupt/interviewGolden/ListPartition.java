package cn.bupt.interviewGolden;



public class ListPartition {
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(4);
		ListNode node2=new ListNode(3);
		ListNode node3=new ListNode(1);
		ListNode node4=new ListNode(5);
		ListNode node5=new ListNode(2);
		ListNode node6=new ListNode(6);
		ListNode node7=new ListNode(7);
		ListNode node8=new ListNode(8);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		ListPartition listPartition=new ListPartition();
		ListNode partitionListNode=listPartition.partition(node1, 3);
		listPartition.outPut(partitionListNode);
		
		
	}
	
	public void outPut(ListNode listNode){
		ListNode curr=listNode;
		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
	}
	
	 public ListNode partition(ListNode pHead, int x) {
	        // write code here
		 if(pHead==null||pHead.next==null)
			 return pHead;
		 ListNode sNode=new ListNode(0);
		 ListNode bNode=new ListNode(0);
		 ListNode curr=pHead,sTempNode=sNode,bTempNode=bNode;
		 while(curr!=null){
			 if(curr.val<x){
				 sTempNode.next=curr;
				 sTempNode=curr;
			 }else{
				 bTempNode.next=curr;
				 bTempNode=curr;
			 }
			 curr=curr.next;
		 }
		 bTempNode.next=null;
		 sTempNode.next=bNode.next;
		 
		 return sNode.next;
	 }

}
