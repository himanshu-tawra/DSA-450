package Array;

class RotateArray{

    static void swap(int arr[], int firstIndex , int secondIndex){
        int tempVariable = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tempVariable;
    }


    static void rotate(int arr[]){

        int lowIndex = 0;
        int highIndex = arr.length - 1;

        while(lowIndex < highIndex){
            swap(arr,lowIndex,highIndex);
            lowIndex++;
            highIndex--;
        }

    }


    public static void main(String[] args){

        int arr[] = {10,20,30,40,50};

        System.out.println("Original Array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        rotate(arr);

        System.out.println("Array after rotation");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();




    }

}