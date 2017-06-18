package cn.bupt.interviewGolden;

public class ClearListValue {
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(2);
		ListNode node4=new ListNode(3);
		ListNode node5=new ListNode(4);
		ListNode node6=new ListNode(3);
		ListNode node7=new ListNode(2);
		ListNode node8=new ListNode(1);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		ClearListValue clearListValue=new ClearListValue();
		ListNode removedList=clearListValue.clear(node1, 2);
		clearListValue.outPut(removedList);
		
		
		
		
	}
	
	public void outPut(ListNode root){
		ListNode curr=root;
		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
	}
	
	public ListNode clear(ListNode head, int val) {
        // write code here
		ListNode root=head;
		while(root!=null&&root.val==val){
			root=root.next;
		}
		ListNode curr=root;
		while(curr!=null){
			while(curr.next!=null&&curr.next.val==val){
				curr.next=curr.next.next;
			}
			curr=curr.next;
		}
		return root;
    }

}
