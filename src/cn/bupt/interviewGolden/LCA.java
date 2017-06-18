package cn.bupt.interviewGolden;

public class LCA {
	
	public static void main(String[] args) {
		LCA lca=new LCA();
		System.out.println(lca.getLCA(5, 8));
	}
	
	public int getLCA(int a, int b) {
        // write code here
		while(a!=b){
			if(a>b)
				a/=2;
			else
				b/=2;
		}
		return a;
    }

}
