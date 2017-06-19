package cn.bupt.interviewGolden;

import java.util.Deque;
import java.util.LinkedList;

public class QuickPower {
	
	public static void main(String[] args) {
		QuickPower quickPower=new QuickPower();
		System.out.println(quickPower.getPower(2, 14876069));
	}
	
	 public int getPower(int k, int N) {
	        // write code here
		 long result=1;
		 int m=1000000007;
		 long temp=k;
		 while(N!=0){
			 if((N&1)!=0){
				 result=(result*temp)%m;
			 }
			 temp=(temp*temp)%m;
			 N>>=1;
		 }
		 return (int) result;
	 }
	 
	 public Deque<Integer> tempResult(int k,int n){
		 Deque<Integer> result=new LinkedList<Integer>();
		 if(n==0)
			 return result;
		 result.addFirst(k);
		 while(n!=0){
			 
			 result.addFirst((result.getFirst()*result.getFirst())%1000000007);
			 n=n>>1;
		 }
		 
		 return result;
	 }

}
