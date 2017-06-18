package cn.bupt.interviewGolden;


public class Divide {
	
	public void outPut(ListNode root){
		ListNode curr=root;
		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(360);
		ListNode node2=new ListNode(220);
		ListNode node3=new ListNode(2);
//		ListNode node4=new ListNode(5);
//		ListNode node5=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
//		node3.next=node4;
//		node4.next=node5;
		Divide divide=new Divide();
		ListNode root=divide.listDivide(node1, 2);
		divide.outPut(root);
		
	}
	
	public ListNode listDivide(ListNode head, int val) {
        // write code here
		ListNode smallNode=new ListNode(0);
		ListNode smallRoot=smallNode;
		ListNode largerNode=new ListNode(0);
		ListNode largerRoot=largerNode;
		ListNode curr=head;
		while(curr!=null){
			if(curr.val<=val){
				smallNode.next=curr;
				smallNode=curr;
			}else{
				largerNode.next=curr;
				largerNode=curr;
			}
			curr=curr.next;
		}
		smallNode.next=largerRoot.next;
		largerNode.next=null;
		return smallRoot.next;
    }
	
	public void swap(ListNode p,ListNode q){
		 if(p!=q){
			 int temp=p.val;
			 p.val=q.val;
			 q.val=temp;
		 }
	 }

}
