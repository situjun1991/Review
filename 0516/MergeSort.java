class MergeSort{
	public static void main(String[] s){
		int[] arr = {3,2,5,2,6,33,21,5,66,231,43,0,1,1,54,2,1,4};
		sort(arr,new int[arr.length],0,arr.length-1);
		for(int i:arr) System.out.print(i+",");
	}
	public static void sort(int[] arr,int[] tmp,int low,int high){
		if(low<high){
			int mid =(low+high)/2;
			sort(arr,tmp,low,mid);
			sort(arr,tmp,mid+1,high);
			merge(arr,tmp,low,mid,high);
		}
	}
	public static void merge(int[] arr,int[] tmp,int low,int mid,int high){
		int index1 = low,index2 = mid+1,index3 = low;
		while(index1<=mid && index2 <= high){
			if(arr[index1]<=arr[index2]) tmp[index3++] = arr[index1++];
			else tmp[index3++] = arr[index2++];
		}
		while(index1<=mid) tmp[index3++] = arr[index1++];
		while(index2<=high) tmp[index3++] = arr[index2++];
		while(low<=high){
			arr[low] = tmp[low++];
		}
	}
}