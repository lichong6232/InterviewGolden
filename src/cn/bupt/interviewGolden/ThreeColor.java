package cn.bupt.interviewGolden;

import java.util.Arrays;

public class ThreeColor {
	
	public static void main(String[] args) {
		int a[]={1,0,0,2,0,1,0,1,1,0,0,1};
		ThreeColor threeColor=new ThreeColor();
		System.out.println(Arrays.toString(threeColor.sortThreeColor(a, a.length)));
	}
	
	public void swap(int A[],int i,int j){
		if(i!=j){
			A[i]=A[i]^A[j];
			A[j]=A[i]^A[j];
			A[i]=A[i]^A[j];
			
		}
	}
	
	 public int[] sortThreeColor(int[] A, int n) {
	        // write code here
		 int pos0=0,pos2=n-1;
		 while(A[pos0]==0)
			 pos0++;
		 while(A[pos2]==2)
			 pos2--;
		 int curr=pos0;
		 while(curr<=pos2){
			 if(A[curr]==0){
				 swap(A, curr, pos0++);
			 }else if(A[curr]==2){
				 swap(A, curr, pos2--);
				 while(A[pos2]==2)
					 pos2--;
				 if(A[curr]==0)
					 swap(A, curr, pos0++);
			 }
			 curr++;
		 }
		 return A;
	 }

}
