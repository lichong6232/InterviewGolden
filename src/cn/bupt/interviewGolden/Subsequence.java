package cn.bupt.interviewGolden;

public class Subsequence {
	
	public static void main(String[] args) {
		int a[]={1,2,3,4};
		Subsequence subsequence=new Subsequence();
		System.out.println(subsequence.shortestSubsequence(a, a.length));
	}

	public int shortestSubsequence(int[] A, int n) {
        // write code here
		int i=0,j=n-1,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,left=1,right=0;
		
		while(i<n){
			if(A[i]>=max)
				max=A[i];
			else
				right=i;
			i++;
		}
		while(j>=0){

			if(A[j]<=min)
				min=A[j];
			else
				left=j;
			j--;
		}
		return right-left+1;
    }
}
