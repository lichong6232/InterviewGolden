package cn.bupt.interviewGolden;

public class ChkLoop {
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
//		node5.next=node3;
		ChkLoop chkLoop=new ChkLoop();
		System.out.println(chkLoop.chkLoop(node1, 0));
	}
	
	public int chkLoop(ListNode head, int adjust) {
        // write code here
		ListNode slow=head,fast=head;

		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				slow=head;
				while(slow!=fast){
					slow=slow.next;
					fast=fast.next;
				}
				return slow.val;
				
			}
				
		}
		return -1;
		
		
    }

}
