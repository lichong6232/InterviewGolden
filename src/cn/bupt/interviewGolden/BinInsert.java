package cn.bupt.interviewGolden;

public class BinInsert {
	
	public static void main(String[] args) {
		BinInsert binInsert=new BinInsert();
		System.out.println(binInsert.binInsert(1024, 19, 2, 6));
	}
	
	public int binInsert(int n, int m, int j, int i) {
        // write code here
		/*StringBuffer s=new StringBuffer();
		for(int k=j;k<=i;k++){
			if(((n>>k)&1)==1)
				s.append("1");
			else{
				s.append("0");
			}
		}
		return n+(m<<(j)-Integer.valueOf(s.toString()));*/
		 m <<= j;
	     return n | m;
		
    }

}
