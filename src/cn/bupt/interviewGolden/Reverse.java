package cn.bupt.interviewGolden;

public class Reverse {
	
	public static void main(String[] args) {
		Reverse reverse=new Reverse();
		String s="VSEVOTKJTGOVMNN DHRDDVWFIC I";
		System.out.println(reverse.reverseSentence(s, s.length()));
	}
	
	public String reverseSentence(String A, int n) {
        // write code here
		char c[]=A.toCharArray();
		reverse(c,0,n-1);
		System.out.println(String.valueOf(c));
		int left=0;
		for(int i=0;i<c.length;i++){
			if(c[i]==' '&&i>0){
				System.out.println(i);
				reverse(c, left, i-1);
				left=i+1;
			}else if(i==c.length-1){
				reverse(c, left, i);
			}
		}
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
