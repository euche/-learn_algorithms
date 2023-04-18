package Sorting;

public class Bubblesort {

    void bubbleSort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {   //for loop to run from initial element to the last element
            for (int j = 0; j < n - i - 1; j++) { //for loop for comparision

                if (num[j] > num[j + 1]) {
                    //swap operation
                    int tempValue = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tempValue;

                }
            }
        }
    }


}
