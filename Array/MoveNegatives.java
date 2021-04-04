
/*
Move all negative numbers to beginning and positive to end with constant extra space.
*/

package Array;

public class MoveNegatives {
    

    public static void moveNegativeElements(int arr[]){

        int i = 0,j = arr.length - 1;

        while(i <= j){

            if(arr[i] < 0 && arr[j] < 0){
                i++;
            }
            else if(arr[i] > 0 && arr[j] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i] > 0 && arr[j] > 0){
                j--;
            }
            else{
                i++;
                j--;
            }

        }


    }

    public static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){


        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };

        System.out.println("Original Array");
        printArray(arr);


        moveNegativeElements(arr);
        System.out.println("After modification");
        printArray(arr);
    }
}
