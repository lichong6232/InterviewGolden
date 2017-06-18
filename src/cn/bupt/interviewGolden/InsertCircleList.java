package cn.bupt.interviewGolden;

public class InsertCircleList {
	
	public static void main(String[] args) {
		InsertCircleList insertCircleList=new InsertCircleList();
		int A[]={1,3,4,5,7};
		int nxt[]={1,2,3,4,0};
		ListNode root=insertCircleList.insert(A, nxt, 2);
		insertCircleList.outPut(root);
	}
	
	
	public void outPut(ListNode root){
		System.out.println(root.val);
		ListNode curr=root.next;
		
		while(curr!=root){
			System.out.println(curr.val);
			curr=curr.next;
		}
		
	}
	
	public ListNode insert(int[] A, int[] nxt, int val) {
        // write code here
		ListNode head=new ListNode(A[0]);
		ListNode curr=head;
		for(int i=0;i<nxt.length-1;i++){
			ListNode node=new ListNode(A[nxt[i]]);
			curr.next=node;
			curr=node;
		}
		curr.next=head;
		ListNode slow=head;
		ListNode fast=head.next;
		ListNode node=new ListNode(val);
		while(fast!=head){
			if(val>=slow.val&&val<=fast.val){
				slow.next=node;
				node.next=fast;
				return head;
			}
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=node;
		node.next=head;
		if(val<=slow.val)
			return node;
		return head;
		
			
		
    }

}
