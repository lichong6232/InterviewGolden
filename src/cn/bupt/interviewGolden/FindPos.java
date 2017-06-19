package cn.bupt.interviewGolden;

public class FindPos {
	
	public static void main(String[] args) {
		int arr[]={-1,0,2,3};
		int n=arr.length;
		FindPos findPos=new FindPos();
		System.out.println(findPos.findPos(arr, n));
	}
	public int findPos(int[] arr, int n) {
        // write code here
		if(arr[0]>n-1)
			return -1;
		if(arr[n-1]<0)
			return -1;
		int res=-1;
		int left=0,right =n-1;
		while(left<=right){
			int mid=left+((right-left)>>1);
			if(arr[mid]>mid){
				right=mid-1;
			}else if(arr[mid]<mid){
				left=mid+1;
			}else{
				res=mid;
				right=mid-1;
			}
		}
		return res;
    }

}
