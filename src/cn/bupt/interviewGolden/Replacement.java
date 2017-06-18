package cn.bupt.interviewGolden;

public class Replacement {
	
	public static void main(String[] args) {
		Replacement replacement=new Replacement();
		String s="Mr John Smith";
		System.out.println(replacement.replaceSpace(s, s.length()));
	}

	 public String replaceSpace(String iniString, int length) {
	        // write code here
		 int nWhite=0;
		 for(int i=0;i<iniString.length();i++){
			 if(iniString.charAt(i)==' ')
				 nWhite++;
		 }
		 StringBuffer result=new StringBuffer(iniString);
		 int newLength=length+2*nWhite;
		 result.setLength(newLength);
		 int lastIndex=newLength-1;
		 for(int i=length-1;i>=0;i--){
			 
			 if(result.charAt(i)==' '){
				 
				 result.setCharAt(lastIndex,'0');
				 result.setCharAt(lastIndex-1,'2');
				 result.setCharAt(lastIndex-2, '%');
				 lastIndex=lastIndex-3;
			 }else{
				 result.setCharAt(lastIndex, result.charAt(i));
				 lastIndex--;
			 }
		 }
		 
		 return result.toString();
		 
		 
	 }
}
