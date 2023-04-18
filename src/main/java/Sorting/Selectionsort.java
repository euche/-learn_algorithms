package Sorting;

public class Selectionsort {

    static void selectionSort(int[] arr) {

        for (int j = 0; j < arr.length; j++) {
            int minimumIndex = j;

            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minimumIndex]) { // compare elements to find minimum index

                    minimumIndex = i;
                }
            }
            //swap operation
            if (minimumIndex != j) { //if minimum index is not equal to j, take the array contents of j and put in the arr[minimum index]
                int temp = arr[j];
                arr[j] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }

        }
    }

    public static void printSarray(int[] arr){  // for use in a Main class
        for(int i =0; i < arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }



}
