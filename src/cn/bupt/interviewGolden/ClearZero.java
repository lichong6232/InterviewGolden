package cn.bupt.interviewGolden;

import java.util.HashSet;
import java.util.Set;

public class ClearZero {
	
	public static void main(String[] args) {
		int mat[][]={{1,2,3},{0,1,2},{0,0,1}};
		ClearZero clearZero=new ClearZero();
		int result[][]=clearZero.clearZero(mat, 3);
		for(int i=0;i<result.length;i++){
			for(int j=0;j<result[i].length;j++){
				System.out.println(result[i][j]+" ");
			}
		}
	}
	
	 public int[][] clearZero(int[][] mat, int n) {
	        // write code here
		 Set<Integer> rowSet=new HashSet<Integer>();
		 Set<Integer> colSet=new HashSet<Integer>();
		 for(int i=0;i<n;i++){
			 for(int j=0;j<n;j++){
				 if(mat[i][j]==0){
					 rowSet.add(i);
					 colSet.add(j);
				 }
			 }
		 }
		 for(int i:rowSet){
			 for(int k=0;k<n;k++){
				 mat[i][k]=0;
			 }
		 }
		 for(int j:colSet){
			 for(int k=0;k<n;k++){
				 mat[k][j]=0;
			 }
		 }
		 
		 return mat;
		 
	 }
	 //第二种方法
	 public int[][] clearZero1(int[][] mat, int n) {
	        // write code here
	        
	       boolean rowArrayNumber[]=new boolean[n];
			boolean colArrayNumber[]=new boolean[n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(mat[i][j]==0){
						rowArrayNumber[i]=true;
						colArrayNumber[j]=true;
					}
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(rowArrayNumber[i]||colArrayNumber[j])
						mat[i][j]=0;
				}
			}
			return mat;
	    }
}
