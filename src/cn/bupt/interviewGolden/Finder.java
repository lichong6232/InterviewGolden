package cn.bupt.interviewGolden;

public class Finder {
	
	
	
	 public boolean findX(int[][] mat, int n, int m, int x) {
	        // write code here
		 int i=0,j=m-1;
		 while(i<n&&j>=0){
			 if(mat[i][j]==x)
				 return true;
			 else if(x<mat[i][j])
				 j--;
			 else
				 i++;
		 }
		 return false;
	 }

}
