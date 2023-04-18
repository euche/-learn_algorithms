package Sorting;

import AVLtree.BinaryHeap;

public class HeapSort {
    // we are using a previous implementation of Binary Heap

    int[] arr = null;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void sortMethod() {
    BinaryHeap bh = new BinaryHeap(arr.length);

    for(int i = 0; i < arr.length;i++){  // insert array elements into BinaryHeap
        bh.insert(arr[i],"Min");
    }
        for(int i = 0; i < arr.length;i++){
            arr[i] = bh.extractHeapofBinaryHeap("Min");
        }
    }


    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
