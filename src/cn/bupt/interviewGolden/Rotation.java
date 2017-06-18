package cn.bupt.interviewGolden;

public class Rotation {
	
	 public boolean chkRotation(String A, int lena, String B, int lenb) {
	        // write code here
		 if(lena!=lenb)
			 return false;
		 return match(A+A, B);
		 
	 }
	 public boolean match(String s,String pattern){
			int next[]=getNext(pattern);
			int j=0;
			int i=0;
			while(i<s.length()&&j<pattern.length()){
				if(j==-1||s.charAt(i)==pattern.charAt(j)){
					i++;
					j++;
				}else{
					j=next[j];
				}
			}
			if(j==pattern.length())
				return true;
			
			
			return false;
		}
		
		public int[] getNext(String pattern){
			int next[]=new int[pattern.length()];
			next[0]=-1;
			int j=0;
			int k=-1;
			while(j<next.length-1){
				if(k==-1||pattern.charAt(j)==pattern.charAt(k)){
					k++;
					j++;
					next[j]=k;
				}else{
					k=next[k];
				}
			}
			
			return next;
		}

}
