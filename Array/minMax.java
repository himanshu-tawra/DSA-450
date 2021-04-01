package Array;

class MinMax{
	
	
	static class Pair{
		
		int min;
		int max;
		
	}
	
	public static Pair minMaxElement(int arr[]){
		
		Pair minMaxPair = new Pair();
		
		minMaxPair.min = arr[0];
		minMaxPair.max = arr[0];
		for(int i = 1; i < arr.length; i++){
			
			if(minMaxPair.min > arr[i]){
				minMaxPair.min = arr[i];
			}
			else if(minMaxPair.max < arr[i]){
				minMaxPair.max = arr[i];
			}
			
		}
		return minMaxPair;
		
	}
	
	
	
	
	
	public static void main(String[] args){
		
		int[] arr = {1,5,10,6,8,4};
		
		Pair result = new Pair();
		result = minMaxElement(arr);
		
		System.out.println("Minimum element " + result.min);
		System.out.println("Maximum element " + result.max);
	}
}