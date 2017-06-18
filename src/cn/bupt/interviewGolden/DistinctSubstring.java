package cn.bupt.interviewGolden;

import java.util.HashMap;
import java.util.Map;

public class DistinctSubstring {
	
	public static void main(String[] args) {
		DistinctSubstring distinctSubstring=new DistinctSubstring();
		System.out.println(distinctSubstring.longestSubstring("aabcb", 5));
	}

	public int longestSubstring(String A, int n) {
        // write code here
		int max=0;
		Map<Character,Integer> preAppearLocation=new HashMap<Character,Integer>();
		int []preArray=new int[n];
		for(int i=0;i<n;i++){
			char c=A.charAt(i);
			Integer preLocation=preAppearLocation.get(c);
			if(preLocation==null){
				preArray[i]=i==0?1:preArray[i-1]+1;
			}else{
				int aPos=preLocation+1;
				int bPos=i-preArray[i-1];
				if(aPos>bPos){
					preArray[i]=i-aPos+1;
				}else{
					preArray[i]=i-bPos+1;
				}
				
			}
			preAppearLocation.put(c, i);
		}
		for(int len:preArray){
			if(len>max)
				max=len;
		}
		
		return max;
    }
}
