package cn.bupt.interviewGolden;

public class CheckIntersect {
	
	public static void main(String[] args) {
		
	}
	
	
	public boolean chkIntersect(ListNode headA, ListNode headB) {
        // write code here
		ListNode currA=headA,currB=headB;
		while(currA!=currB){
			currA=currA==null?headB:currA.next;
			currB=currB==null?headA:currB.next;
		}
		return currA==null?false:true;
    }

}
