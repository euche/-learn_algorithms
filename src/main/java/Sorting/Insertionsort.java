package Sorting;

public class Insertionsort {

    static void insertionSort(int[] arr){
       for(int i = 1; i < arr.length; i++ ){ // i starts from 1, for easy comparison
         int temp = arr[i];
         int j = i;
         while(j>0 && arr[j-1]> temp){  // while arr[j-1](previous element) is greater than the next element(temp) in the array
           arr[j] = arr[j-1]; //swap previous element with next element
           j--;
         }
         arr[j] = temp;

       }   // this algo produces the average scenario O(n2) due to double loops
    }

    public static void printSarray(int[] arr){  // for use in a Main class
        for(int i =0; i < arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
