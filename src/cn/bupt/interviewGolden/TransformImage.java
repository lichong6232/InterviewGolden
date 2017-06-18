package cn.bupt.interviewGolden;

public class TransformImage {
	
	public static void main(String[] args) {
		TransformImage transformImage=new TransformImage();
		int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int result[][]=transformImage.transformImage(mat, 4);
		for(int i=0;i<result.length;i++){
			for(int j=0;j<result[i].length;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public int[][] transformImage(int[][] mat, int n) {
        // write code here
		int rowUp=0,rowDown=n-1;
		while(rowUp<rowDown){
			for(int i=0;i<n;i++){
				int temp=mat[rowUp][i];
				mat[rowUp][i]=mat[rowDown][i];
				mat[rowDown][i]=temp;
			}
			++rowUp;
			--rowDown;
		}
		
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		return mat;
    }

}
