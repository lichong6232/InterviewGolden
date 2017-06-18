package cn.bupt.interviewGolden;

public class Transform {
	
	public static void main(String[] args) {
		Transform transform=new Transform();
		System.out.println(transform.calcCost(10, 5));
	}
	
	 public int calcCost(int A, int B) {
	        // write code here
		 int temp=A^B;
		 int n=0;
		 while(temp!=0){
			 if((temp&1)==1){
				 n++;
			 }
			 temp>>=1;
			 
		 }
		 return n;
	 }

}
