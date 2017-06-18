package cn.bupt.interviewGolden;

public class CheckReverseEqual {
	
	public static void main(String[] args) {
		String s1="Hello world";
		String s2="worldhello ";
		CheckReverseEqual checkReverseEqual=new CheckReverseEqual();
		System.out.println(checkReverseEqual.checkReverseEqual(s1, s2));
		
	}
	//·½·¨¶þ
	public boolean checkReverseEqual1(String s1, String s2) {
        // write code here
		String str=s1+s1;
		if(str.contains(s2))
			return true;
		return false;
    }
	
	public boolean checkReverseEqual(String s1, String s2) {
        // write code here
		
		
		char firstChar2=s2.charAt(0);
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==firstChar2){
				if(rotateString(s1, i).equals(s2)){
					return true;
				}
			}
		}
		return false;
    }
	
	public String rotateString(String s,int k){
		String pre=s.substring(0, k);
		String subfix=s.substring(k, s.length());
		return subfix+pre;
	}

}
