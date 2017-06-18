package cn.bupt.interviewGolden;

public class PlusAB {
	
	public static void main(String[] args) {
		PlusAB plusAB=new PlusAB();
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(3);
		ListNode node5=new ListNode(2);
		ListNode node6=new ListNode(1);
		ListNode node7=new ListNode(4);
		ListNode node8=new ListNode(5);
		node1.next=node2;
		node2.next=node3;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		ListNode sum=plusAB.plusAB(node1, node4);
		plusAB.outPut(sum);
		
	}
	public void outPut(ListNode listNode){
		ListNode curr=listNode;
		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
	}
	
	
	
	public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
		if(a==null)
			return b;
		if(b==null)
			return a;
		ListNode currentA=a,currentB=b,pre=a;
		int income=0;
		while(currentA!=null&&currentB!=null){
			int tempSum=currentA.val+currentB.val+income;
			currentA.val=tempSum%10;
			income=tempSum/10;
			pre=currentA;
			currentA=currentA.next;
			currentB=currentB.next;
			
		}
		if(currentA==null){
			pre.next=currentB;
			while(currentB!=null&&income>0){
				int tempSum=currentB.val+income;
				currentB.val=tempSum%10;
				income=tempSum/10;
				pre=currentB;
				currentB=currentB.next;
			}
			if(income>0){
				if(pre!=null){
					pre.next=new ListNode(income);
				}
				
			}
			
			
		}
		
		
		return a;
    }

}
