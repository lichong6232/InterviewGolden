package cn.bupt.interviewGolden;

public class KListNodeInverse {
	
	public static void main(String[] args) {
		KListNodeInverse kListNodeInverse=new KListNodeInverse();
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
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
		
		ListNode reverseNode=kListNodeInverse.inverse(node1, 3);
		kListNodeInverse.outPut(reverseNode);
		
		
	}
	
	public void outPut(ListNode root){
		ListNode curr=root;
		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
	}
	
	 public ListNode inverse(ListNode head, int k) {
	        // write code here
		 int i=1;
		 ListNode curr=head;
		 ListNode first=head;
		 ListNode pre=null;
		 ListNode root=null;
		 while(curr!=null){
			 ListNode nextNode=curr.next;
			 if(i%k==0){
				 ListNode reverseNode=reverse(first, nextNode);
				 if(pre!=null){
					 pre.next=reverseNode;
				 }else{
					 root=reverseNode;
				 }
				 pre=first;
				 first=nextNode;
				
			 }
			 i++;
			 curr=nextNode;
		 }
		 return root;
		 
	 }
	 
	 public ListNode reverse(ListNode first,ListNode last){
		 //last节点不参与反转，也即是last节点是要反转的节点的最后一个节点的下一个节点
		 ListNode pre=null;
		 ListNode curr=first;
		 while(curr!=last){
			 ListNode next=curr.next;
			 curr.next=pre;
			 pre=curr;
			 curr=next;
		 }
		 first.next=last;
		 return pre;
	 }

}
