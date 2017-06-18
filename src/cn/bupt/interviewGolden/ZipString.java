package cn.bupt.interviewGolden;

public class ZipString {
	
	public static void main(String[] args) {
		ZipString zipString=new ZipString();
		String iniString="abc";
		System.out.println(zipString.zipString(iniString));
	}
	
	public String zipString(String iniString) {
        // write code here
		
		String s="";
		char tag=iniString.charAt(0);int index=0;
		for(int i=1;i<iniString.length();i++){
			char temp=iniString.charAt(i);
			if(temp!=tag){
				s+=String.valueOf(tag)+(i-index);
				tag=temp;
				index=i;
			}
			if(i==iniString.length()-1){
				s+=String.valueOf(tag)+(i-index+1);
			}
			
		}
		return iniString.equals(s.replaceAll("1",""))?iniString:s;
    }

}
