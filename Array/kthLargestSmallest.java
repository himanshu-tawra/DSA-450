package Array;

import java.util.Arrays;

class kthLargestSmallest{

    public static int getLargest(int arr[],int k){

        Arrays.sort(arr);
        if(k > arr.length){
            return -1;
        }
        return arr[arr.length - k]; 

    }

    public static int getSmallest(int arr[],int k){
        Arrays.sort(arr);
        if(k > arr.length){
            return -1;
        }
        return arr[k-1];

    }


    public static void main(String[] args){

        int arr[] = {5,3,7,12,21,14,19,6,10,1}; 
        int k = 4;
        int largest = getLargest(arr, k);
        int smallest = getSmallest(arr, k);

        if(largest != -1){
            System.out.println(k +"th largest element : " + largest);
        }
        if(smallest != -1){
            System.out.println(k +"th smallest element : " + smallest);
        }

    }


}