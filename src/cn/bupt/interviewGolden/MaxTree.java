package cn.bupt.interviewGolden;

import java.util.Arrays;

public class MaxTree {
	
	public static void main(String[] args) {
		MaxTree maxTree=new MaxTree();
		int A[]={340,1387,2101,847,1660,733,36,528};
		System.out.println(Arrays.toString(maxTree.buildMaxTree(A, 8)));
	}
	
	public int[] buildMaxTree(int[] A, int n) {
        // write code here
		int result[]=new int[n];
		for(int i=0;i<n;i++){
			int leftMaxIndex=leftMaxIndex(A, i);
			int rightMaxIndex=rightMaxIndex(A, i);
			System.out.println("-------------"+i+"-----------");
			System.out.println("×ó±ß:"+leftMaxIndex+",ÓÒ±ß"+rightMaxIndex);
			if(leftMaxIndex==-1||rightMaxIndex==-1)
				result[i]=Math.max(leftMaxIndex, rightMaxIndex);
			else
				result[i]=A[leftMaxIndex]>A[rightMaxIndex]?rightMaxIndex:leftMaxIndex;
		}
		return result;
		
    }
	
	private int leftMaxIndex(int a[],int k){
		int maxIndex=k;
		for(int i=k-1;i>=0;i--){
			if(a[i]>a[maxIndex]){
				maxIndex=i;
				break;
			}
				
		}
		return maxIndex==k?-1:maxIndex;
		
	}
	
	
	private Integer rightMaxIndex(int a[],int k){
		int maxIndex=k;
		for(int i=k+1;i<a.length;i++){
			if(a[i]>a[maxIndex]){
				maxIndex=i;
				break;
			}
				
		}
		return maxIndex==k?-1:maxIndex;
	}

}
