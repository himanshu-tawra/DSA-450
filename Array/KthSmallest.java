public class KthSmallest{


	
	public static int partition(int[] arr,int low, int high){
		
		int last = arr[high] ,i = low;
		for(int j = low; j < high; j++){
			if(arr[j] < last){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
		int temp = arr[high];
		arr[high] = arr[i];
		arr[i] = temp;
		return i;
	}
							
	public static int KthSmallestElement(int[] arr,int low,int high ,int k){ 
		
		if(k > 0 && k <= high - low + 1){
			
			int pivot = partition(arr,low,high);
			
			if(pivot - low == k - 1){
				return arr[pivot];
			}
			else if(pivot - low > k - 1){
				return KthSmallestElement(arr,low,pivot - 1, k);	
			}
			return KthSmallestElement(arr,pivot + 1, high , k);
		}
		return Integer.MAX_VALUE;
	}
	

	public static void main(String[] args){
		
		int[] arr = {7,9,12,4,3,6,8};
		int len = arr.length;

		System.out.println("5th smallest element is " + KthSmallestElement(arr,0,len - 1,5));		
		
	}


}