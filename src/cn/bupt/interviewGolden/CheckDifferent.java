package cn.bupt.interviewGolden;

public class CheckDifferent {
	
	public static void main(String[] args) {
		CheckDifferent checkDifferent=new CheckDifferent();
		String iniString="aeiou";
		System.out.println(checkDifferent.checkDifferent(iniString));
	}
	
	 public boolean checkDifferent(String iniString) {
		 
		 char c[]=iniString.toCharArray();
	     return partition(c,0,c.length-1);
	 }
	 
	 public void swap(char a[],int i,int j){
			if(i!=j){
				a[i]=(char) (a[i]^a[j]);
				a[j]=(char) (a[i]^a[j]);
				a[i]=(char) (a[i]^a[j]);
			}
	 }
	 
	 public boolean partition(char a[],int left,int right){
		 
		 if(left>=right)
			 return true;
		 
			int i=left-1;
			char temp=a[left];
			int j=right+1;
			int current=left;
			while(current!=j){
				if(a[current]==temp){
					current++;
				}else if(a[current]<temp){
					swap(a, ++i, current);
				}else{
					swap(a, --j, current);
				}
			}
			int leftPartition=i+1,rightPartition=j-1;
			if(leftPartition!=rightPartition)
				 return false;
			return partition(a, left, leftPartition-1)&&partition(a, leftPartition+1, right);
		}

}
