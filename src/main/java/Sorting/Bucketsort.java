package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Bucketsort {

    int[] arr;

    public Bucketsort(int[] arr) {
        this.arr = arr;
    }


    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }


    // creating Helper methods, Not Compulsory...Just for visualisation of buckets
    public void printBuckets(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket# " + i + ":");
            for (int j =0;j <buckets[i].size();j++){// print each bucket's content
                System.out.print(buckets[i].get(j)+" ");
            }
        }
    }


    public void bucketSort() {

        //creation of buckets
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length)); // Math Ceil and Square root methods return results in double
        int maxValue = Integer.MIN_VALUE;

        // find the maximum value in the array...
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // intialising the empty Arraylist
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int value : arr) {
            int bucketNumber = (int) Math.ceil(((float) value * numberOfBuckets) / (float) maxValue); // find the Appropriate bucketNumber for any element in the array to be inserted
            buckets[bucketNumber - 1].add(value); // buckets index starts from 0,hence we use bucketNumber-1;  insert element into bucket.
        }

        // Not compulsory
        System.out.println("\n\n prints buckets before sorting");
        printBuckets(buckets);

        //sort the buckets individually
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        //Not compulsory
        System.out.println("\n\n prints buckets after sorting");
        printBuckets(buckets);

        int index = 0;  //combine value in buckets
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) { // a for loop
                arr[index] = value;
                index++;
            }
        }


    }


}
