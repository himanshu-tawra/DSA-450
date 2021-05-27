/*
	Program to find minmum and maximum in an array 

*/

public class MinMax{

	public static int[] minMax(int[] arr,int len){
		
		int[] result = new int[2];

		for(int i = 0; i < len; i++){
			if(arr[i] > result[1]){
				result[1] = arr[i];
			}
			else if(arr[i] < result[0]){
				result[0] = arr[i];
			}
		}
		return result;
	}
	

	public static void main(String[] args){
		
		int[] arr = {1,2,3,4,5,6,7};
		int len = arr.length;

		int[] result = minMax(arr,len);
		System.out.println("Maximum value in array is " + result[1]);
		System.out.println("Minimum value in array is " + result[0]); 		
		
	}

}