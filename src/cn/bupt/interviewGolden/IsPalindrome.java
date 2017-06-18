package cn.bupt.interviewGolden;

import java.util.Stack;

public class IsPalindrome {
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
//		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(1);
		ListNode node5=new ListNode(1);
		node1.next=node2;
		node2.next=node4;
//		node3.next=node4;
		node4.next=node5;
		IsPalindrome isPalindrome=new IsPalindrome();
		System.out.println(isPalindrome.isPalindrome(node1));
	}
	
	 public boolean isPalindrome(ListNode pHead) {
	        // write code here
		 
		 if(pHead==null)
			 return false;
		 ListNode slow=pHead,fast=pHead;
		 Stack<ListNode> stack=new Stack<ListNode>();
		 stack.add(pHead);
		 while(fast.next!=null&&fast.next.next!=null){
			 fast=fast.next.next;
			 slow=slow.next;
			 stack.add(slow);
		 }
		 boolean isOdd=false;
		 if(fast.next==null)
			 isOdd=true;
		 if(isOdd){
			 stack.pop();
		 }
		 while(!stack.isEmpty()){
			 slow=slow.next;
			 if(stack.pop().val!=slow.val){
				 return false;
			 }
		 }
		 return true;
	 }

}
