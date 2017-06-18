package cn.bupt.interviewGolden;

public class Translation {
	
	public static void main(String[] args) {
		Translation translation=new Translation();
		String A="RJXJYA";
		System.out.println(translation.stringTranslation(A, 6, 1));
	}
	
	 public String stringTranslation(String A, int n, int len) {
	        // write code here
		 char c[]=A.toCharArray();
		 reverse(c, 0, len-1);
		 reverse(c, len, n-1);
		 reverse(c, 0, n-1);
		 return String.valueOf(c);
	 }
	 
	 public void reverse(char c[],int i,int j){
			while(i<j){
				c[i]=(char) (c[i]^c[j]);
				c[j]=(char) (c[i]^c[j]);
				c[i]=(char) (c[i]^c[j]);
				i++;
				j--;
			}
	  }

}
