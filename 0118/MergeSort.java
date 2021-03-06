class MergeSort{
	public static void main(String[] args){
		int[] arr = {22,4,5,87,6,2,4,8,1,0,8,9,3,55,5,2,5,4};
		int[] tmp = new int[arr.length];
		int low = 0,high = arr.length-1;
		sort(arr,tmp,low,high);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	public static void sort(int[] arr,int[] tmp,int low,int high){
		int mid = (low+high)/2;
		if(low<high){
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
		while(index1<=mid){
			tmp[index3++] = arr[index1++];
		}
		while(index2<=high){
			tmp[index3++] = arr[index2++];
		}
		while(low<=high){
			arr[low] = tmp[low++];
		}
	}
}