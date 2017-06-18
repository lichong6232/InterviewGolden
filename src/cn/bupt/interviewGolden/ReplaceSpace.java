package cn.bupt.interviewGolden;

public class ReplaceSpace {
	
	public static void main(String[] args) {
		ReplaceSpace replaceSpace=new ReplaceSpace();
		String s="Mr John Smith";
		String replaceString=replaceSpace.replaceSpace(s,s.length());
		System.out.println(replaceString);
	}
	
	 public String replaceSpace(String iniString, int length) {
	        // write code here
		 int space=0;

		 for(int i=0;i<length;i++){
			 if(iniString.charAt(i)==' '){
				 ++space;
			 }
		 }
		 int oldLength=length+2*space;
		 StringBuffer s=new StringBuffer(iniString);
		 s.setLength(oldLength);
		 int j=oldLength-1;
		 for(int i=length-1;i>=0;i--){
			 char temp=s.charAt(i);
			 if(temp==' '){
				 s.setCharAt(j, '0');
				 s.setCharAt(j-1, '2');
				 s.setCharAt(j-2, '%');
				 j-=3;
			 }else{
				 s.setCharAt(j--, temp);
			 }
		 }
		 return s.toString();
		 
	 }

}
