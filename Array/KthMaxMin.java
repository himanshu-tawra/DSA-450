import java.util.*;

public class KthMaxMin{

	
	public static int kthLargest(int[] arr,int k,int len){
			
		PriorityQueue<Integer> myHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i = 0; i < len; i++){
			myHeap.add(arr[i]);
		}		
		
		int result;
		for(int i = 0; i < k - 1; i++){
			myHeap.remove(); 
		}
		
		return myHeap.peek();
	}

	public static int kthSmallest(int[] arr,int k,int len){
		
		PriorityQueue<Integer> myHeap = new PriorityQueue<Integer>();
		for(int i = 0; i < len; i++){
			myHeap.add(arr[i]);
		}		
		
		int result;
		for(int i = 0; i < k - 1; i++){
			myHeap.remove(); 
		}
		
		return myHeap.peek();
	}

		


	public static void main(String[] args){
		
		int[] arr = {1,2,3,4,5,6,7};
		int len = arr.length;
		int k = 4;
		System.out.println(k + "th largest element is " + kthLargest(arr,k,len));
		System.out.println(k + "th smallest element is " + kthSmallest(arr,k,len));
		
	}

}