package Sorting;

public class QuickSort {

    // As described, first Method wil be the Partition, second Method will be the QUICKSORT Algorithm.

    // return integer value that will be used as Pivot number; start=>element at left position, end=> element at right position
    static int Partition(int[] array, int start, int end) {
        int pivot = end;             // for simplicity, we use the rightmost number
        int i = start - 1;             //using i -> for loop; keeping in mind the zero index

        for (int j = start; j <= end; j++) {
            if (array[j] <= array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }

    public static void quickSort(int[] array, int start, int end) { // O(Nlogn)
        if (start < end) {
            int pivot = Partition(array, start, end);
            // calling quicksort Recursively for elements located at the leftside of pivot and elements located at the rightside of pivot
            quickSort(array, start, pivot - 1); // leftside; starts from 0 to pivot
            quickSort(array, pivot + 1, end); // rightside; starts from pivot to end
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
