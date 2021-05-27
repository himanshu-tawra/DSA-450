
/*
	Program to reverse an array
*/

public class Reverse{
	
	public static void reverseArray(int[] arr){
		int temp;
		int i = 0;
		int j = arr.length - 1;
		while(i < j){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;	
		}
		
	}
	
	public static void displayArray(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		
		reverseArray(arr);
		displayArray(arr);		
			

	}
	


}