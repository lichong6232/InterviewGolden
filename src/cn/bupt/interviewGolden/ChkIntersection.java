package cn.bupt.interviewGolden;

public class ChkIntersection {
	
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
		node5.next=node3;
		ListNode node8=new ListNode(8);
		ListNode node7=new ListNode(7);
//		ListNode node6=new ListNode(6);
		node8.next=node7;
		node7.next=node5;

		ChkIntersection chkIntersection=new ChkIntersection();
		System.out.println(chkIntersection.chkInter(node1, node8, 0, 0));
//		System.out.println(chkIntersection.getCircle(node1));
		
	}
	
	public boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1) {
        // write code here
		ListNode circle1=getCircle(head1);
		ListNode circle2=getCircle(head2);
		if(circle1==null||circle1==null)
			return false;
		
		if(circle1==circle2)
			return true;
		ListNode curr=circle1.next;
		while(curr!=circle1){
			
			if(curr==circle2)
				return true;
			curr=curr.next;
		}
		return false;
		

		
    }
	
	public ListNode getCircle(ListNode root){
		ListNode slow=root,fast=root;
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				slow=root;
				while(fast!=slow){
					fast=fast.next;
					slow=slow.next;
				}
				return slow;
			}
		}
		return null;
	}
	
	
	public boolean chkInter2(ListNode head1, ListNode head2, int adjust0, int adjust1) {
        // write code here
		ListNode circle1=getCircle(head1);
		ListNode circle2=getCircle(head2);
		if(circle1==null&&circle1==null){
			ListNode curr1=head1,curr2=head2;
			while(curr1!=curr2){
				curr1=curr1==null?head2:curr1.next;
				curr2=curr2==null?head1:curr2.next;
			}
			return curr1==null?false:true;
		}else if(circle1!=null&&circle2!=null){
			if(circle1==circle2)
				return true;
			ListNode curr=circle1.next;
			while(curr!=circle1){
				
				if(curr==circle2)
					return true;
				curr=curr.next;
			}
			return false;
		}
		return false;
    }
}
