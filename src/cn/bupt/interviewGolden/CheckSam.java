package cn.bupt.interviewGolden;

public class CheckSam {
	
	public static void main(String[] args) {
		CheckSam checkSam=new CheckSam();
		String stringA="Here you are";
		String stringB="Are you here";
		System.out.println(checkSam.checkSam(stringA, stringB));
	}
	
	 public boolean checkSam(String stringA, String stringB) {
	        // write code here
		 if(stringA.length()!=stringB.length())
			 return false;
		 int length=stringA.length();
		 int minA=Integer.MAX_VALUE,maxA=Integer.MIN_VALUE;
		 int minB=Integer.MAX_VALUE,maxB=Integer.MIN_VALUE;
		 for(int i=0;i<length;i++){
			 if(stringA.charAt(i)<minA){
				 minA=stringA.charAt(i);
			 }
			 if(stringA.charAt(i)>maxA){
				 maxA=stringA.charAt(i);
			 }
			 if(stringB.charAt(i)<minB){
				 minB=stringB.charAt(i);
			 }
			 if(stringB.charAt(i)>maxB){
				 maxB=stringB.charAt(i);
			 }
		 }
		 
		 if(minA!=minB||maxA!=maxB)
			 return false;
		 int min=minA,max=maxA;
		 int cA[]=new int[max-min+1];
		 int cB[]=new int[max-min+1];
		 for(int i=0;i<stringA.length();i++){
			 cA[stringA.charAt(i)-min]++;
		 }
		 for(int i=0;i<stringB.length();i++){
			 cB[stringB.charAt(i)-min]++;
		 }
		 for(int i=0;i<cA.length;i++){
			 if(cA[i]!=cB[i])
				 return false;
		 }
		 return true;
		 
			 
	 }

}
