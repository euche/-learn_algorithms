package Sorting;

public class Countingsort {

    public void cSort(char[] arr) {

        // we are using character array

        int n = arr.length;
        // The output character array that will have sorted
        // arr

        char[] output = new char[n];

        // create a count array to store count of individual
        // characters
        int[] count = new int[256];
        for (int i = 0; i < 256; ++i) {
            count[i] = 0;
        }

        // store count of each character
        for (int i = 0; i < n; ++i) {
            ++count[arr[i]];   // increase count, then store
        }

        // Change count[i] so that count[i] now contains
        // actual position of this character in output array
        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];   //i =1;  count[1] = count[i]+count[i-1] and so on.
        }

        //  Build the output character array
        // To make it stable we are operating in reverse
        // order.
        for (int i = n - 1; i >= 0; i--) {      // here n-1 is the last character....
            output[count[arr[i]] - 1] = arr[i];  //
            --count[arr[i]];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];

    }

    //counting sort for positive integers..
    public static void countingSort(int[] input, int k) { // create buckets
        int counter[] = new int[k + 1]; // fill buckets
        for (int i : input) {
            counter[i]++;
        }
        // sort array
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {

                input[ndx++] = i;

                counter[i]--;
            }

        }
    }


    public static void main(String args[]) {
        Countingsort ob = new Countingsort();
        char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'};

        // Function call
        ob.cSort(arr);

        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
    }

}
