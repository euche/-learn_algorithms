package Sorting;

public class MergeSort {

    //we create a helper function called Merge Method
    static void merge(int[] arr, int left, int middle, int right) {

        int[] leftTempArray = new int[middle - left + 2];    //+2 and +1 for avoid arrayindexexception produced at runtime
        int[] rightTempArray = new int[right - middle + 1];

        for (int i = 0; i <= middle - left; i++) {
            leftTempArray[i] = arr[left + i];      //insert into left temp array; count(i) is from 0 to middle
        }

        for (int i = 0; i <= right - middle; i++) {         // insert into right temp array; count(i) is from middle to left
            rightTempArray[i] = arr[middle + 1 + i];
        }

        leftTempArray[middle - left + 1] = Integer.MAX_VALUE;        //for  comparison purposes; move the less elements on the right edge and the bigger elements on the left edge
        rightTempArray[right - middle] = Integer.MAX_VALUE;


        //2 integers i for leftTemp, j for rightTemp
        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTempArray[i] < rightTempArray[j]) {
                arr[k] = leftTempArray[i];
                i++; //increase i by 1 after the operation
            } else {
                arr[k] = rightTempArray[j];
                j++;
            }

        }


    }

    public static void mergeSort(int[] arr, int left, int right) {

        if (right > left) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }

    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
