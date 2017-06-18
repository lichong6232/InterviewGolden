package cn.bupt.interviewGolden;

public class ReverseString {

	public String reverseString(String iniString) {
        // write code here
		char c[]=iniString.toCharArray();
		int i=0,j=c.length-1;
		while(i<j){
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			++i;
			--j;
		}
		return new String(c);
    }
}
