package cn.bupt.interviewGolden;


public class LessIndex {
	
	public static void main(String[] args) {
		int arr[]={3,2,9,2,1,4,0,10,9,0,8,3,5,6,7,1,9,2,4,0,7};
		LessIndex lessIndex=new LessIndex();
		System.out.println(lessIndex.getLessIndex(arr));
	}
	
	public int getLessIndex(int[] arr) {
		if(arr==null || arr.length==0)
			return -1;
		if(arr[0]<arr[1]){
			return 0;
		}
		if(arr[arr.length-1]<arr[arr.length-1])
			return arr.length-1;
		return getLess(arr, 0, arr.length-1);
    }
	
	public int getLess(int arr[],int left,int right){
		
		if(left<right){
			int mid=left+(right-left)>>1;
			System.out.println(arr[mid]);
			if(arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
				return mid;
			}else if(arr[mid]>arr[mid-1]){
				return getLess(arr, left, mid-1);
			}else{
				return getLess(arr, mid+1, right);
			}
		}else{
			return -1;
		}
		
		
		
	}

}
