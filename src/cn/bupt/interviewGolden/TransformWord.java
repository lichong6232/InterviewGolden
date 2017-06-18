package cn.bupt.interviewGolden;

public class TransformWord {
	
	
	public static void main(String[] args) {
		TransformWord transform=new TransformWord();
		System.out.println(transform.chkTransform("abc", 3, "bca", 3));
	}
	public boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
		if(lena!=lenb)
			return false;
		int minA=Integer.MAX_VALUE,maxA=Integer.MIN_VALUE;
		int minB=Integer.MAX_VALUE,maxB=Integer.MIN_VALUE;
		for(int i=0;i<A.length();i++){
			int temp=A.charAt(i);
			if(temp<minA)
				minA=temp;
			if(temp>maxA)
				maxA=temp;
		}
		for(int i=0;i<B.length();i++){
			int temp=B.charAt(i);
			if(temp<minB)
				minB=temp;
			if(temp>maxB)
				maxB=temp;
		}
		
		if(minA!=minB||maxA!=maxB)
			return false;
		int cA[]=new int[maxA-minA+1];
		for(int i=0;i<A.length();i++){
			cA[A.charAt(i)-minA]++;
		}
		int cB[]=new int[maxB-minB+1];
		for(int i=0;i<B.length();i++){
	
			cB[B.charAt(i)-minB]++;
		}
		
		for(int i=0;i<cA.length;i++){
			if(cA[i]!=cB[i])
				return false;
		}
		return true;
		
		
		
    }

}
