package cn.bupt.interviewGolden;

public class PalindromeList {
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(2);
		ListNode node4=new ListNode(1);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		PalindromeList palindromeList=new PalindromeList();
		System.out.println(palindromeList.isPalindrome(node1));
		
		
	}
	
	public void outPut(ListNode root){
		ListNode curr=root;
		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
	}

	public boolean isPalindrome(ListNode pHead) {
        // write code here
		if(pHead==null)
			return false;
		ListNode mid=getMid(pHead);
		ListNode midNext=mid.next;
		ListNode lastNode=reverse(midNext,null);
		midNext.next=mid;
		mid.next=null;
		ListNode first=pHead;
		boolean tag=true;
		ListNode last=lastNode;
		while(first!=null){
			if(first.val!=last.val){
				tag=false;
				break;
			}
				
			first=first.next;
			last=last.next;
		}
		mid.next=reverse(lastNode, mid);
		return tag;
		
    }
	
	public ListNode getMid(ListNode root){
		ListNode slow=root,fast=root;
		while(fast.next!=null&&fast.next.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	
	public ListNode reverse(ListNode node,ListNode end){
		ListNode curr=node;
		ListNode pre=null;
		while(curr!=end){
			ListNode next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}
		return pre;
	}
	
}
