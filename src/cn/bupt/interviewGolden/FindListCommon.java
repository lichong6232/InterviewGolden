package cn.bupt.interviewGolden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindListCommon {
	
	public static void main(String[] args) {
		FindListCommon findListCommon=new FindListCommon();
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		ListNode node7=new ListNode(7);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		
		ListNode node21=new ListNode(2);
		ListNode node22=new ListNode(4);
		ListNode node23=new ListNode(6);
		ListNode node24=new ListNode(8);
		ListNode node25=new ListNode(10);
		
		node21.next=node22;
		node22.next=node23;
		node23.next=node24;
		node24.next=node25;
		int result[]=findListCommon.findCommonParts(node1, node21);
		System.out.println(Arrays.toString(result));
	}
	
	public int[] findCommonParts(ListNode headA, ListNode headB) {
        // write code here
		List<Integer> list=new ArrayList<Integer>();
		ListNode currA=headA,currB=headB;
		while(currA!=null&&currB!=null){
			if(currA.val==currB.val){
				list.add(currA.val);
				currA=currA.next;
				currB=currB.next;
			}
				
			else if(currB.val<currA.val)
				currB=currB.next;
			else
				currA=currA.next;
		}
		int result[]=new int[list.size()];
		for(int i=0;i<result.length;i++){
			result[i]=list.get(i);
		}
		return result;
    }

}
