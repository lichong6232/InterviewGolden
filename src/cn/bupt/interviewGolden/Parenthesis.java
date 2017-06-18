package cn.bupt.interviewGolden;

public class Parenthesis {
	
	public static void main(String[] args) {
		Parenthesis parenthesis=new Parenthesis();
		String A="()(()()";
		System.out.println(parenthesis.chkParenthesis(A, 7));
	}
	
	 public boolean chkParenthesis(String A, int n) {
	        // write code here
		 int numbers=0;
		 for(int i=0;i<n;i++){
			 if(A.charAt(i)=='(')
				 numbers++;
			 else if(A.charAt(i)==')')
				 numbers--;
			 else
				 return false;
			 if(numbers<0)
				 return false;
		 }
		 if(numbers==0)
			 return true;
		 return false;
	 }

}
