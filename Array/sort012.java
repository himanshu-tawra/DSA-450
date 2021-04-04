package Array;

public class sort012 {


    public static void sortArray(int arr[]){

        int count0 = 0, count1 = 0, count2 = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
        }

        
        int i = 0;
        while(count0 != 0){
            arr[i] = 0;
            count0--;
            i++;
        }
        
        while(count1 != 0){
            arr[i] = 1;
            count1--;
            i++;
        }
        while(count2 != 0){
            arr[i] = 2;
            count2--;;
            i++;
        }
        
        
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        System.out.println("Array before sorting");
        printArray(arr);

        sortArray(arr);

        System.out.println("Array after sorting");
        printArray(arr);


    }
    
}
