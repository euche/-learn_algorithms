package Numberarray;

public class MergeSortedArray {

    public static void main(String[] args) throws Exception {

    }

    // Problem
    // Given 2 sorted integer arrays A and B, merge B into A as one sorted array

    //Steps/Thoughts
    //The key to solve this problem is moving element of A and B backwards. If B has some
    //elements left after A is done, also need to handle that case.


    public static void merge(int A[], int m, int B[], int n) {

        while (m > 0 && n > 0) {
            if (A[m - 1] > B[n - 1]) {
                A[m + n - 1] = A[m - 1];
                m--;
            } else {
                A[m + n - 1] = B[n - 1];
                n--;
            }
        }

        while (n > 0) {
            A[m + n - 1] = B[n - 1];
            n--;
        }
    }


}
