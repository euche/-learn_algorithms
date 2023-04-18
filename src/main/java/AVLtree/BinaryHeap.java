/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVLtree;


import java.util.*;

/**
 * @author Dell
 */
public class BinaryHeap {


    int array[];  //Empty Array
    int sizeOfTree;


    //constructor
    public BinaryHeap(int size) {

        array = new int[size + 1];
        this.sizeOfTree = 0;

        System.out.println("Binary Heap has been created");
    }

    public boolean isEmpty() {

        if (sizeOfTree == 0) {
            return true;
        } else {
            return false;
        }

    }


    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Binary heap is empty");
            return null;
        }

        return array[1];                      //time Complexity is O(1)
    }

    public Integer sizeofBP() {
        return sizeOfTree;
    }


    public void levelOrderinBHP() {
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println("\n");

    }


    //Insertion of Node in Binary Heap

    public void heapifyBottomToTop(int index, String heapType) { //Time complexity O(LogN)

        int parent = index / 2;

        if (index <= 1) {
            return;
        }
        if (heapType == "Min") {
            //we do a swap up of inserted node to the top of the binary Heap
            if (array[index] < array[parent]) {
                int temp = array[index];              //assign index of number to be inserted to temporary index
                array[index] = array[parent];        // swap parent with index
                array[parent] = temp;                   // put temporary in index of parent

            }

        } else if (heapType == "Max") {

            if (array[index] > array[parent]) {
                int temp = array[index];              //assign index of number to be inserted to temporary index
                array[index] = array[parent];        // swap parent with index
                array[parent] = temp;                   // put temporary in index of parent

            }
        }

        heapifyBottomToTop(parent, heapType);                      //Time and Space complexity = O(LogN) RECURSION

    }


    public void insert(int value, String typeHeap) {

        array[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);                     //Time and Space complexity = O(LogN)

        System.out.println("Inserted " + value + " Successfully in Heap");
        levelOrderinBHP();
    }


    //Extract a Node in Binary Heap
    // HeapifyTopTOBottom  THis Example if for a minimum Binary Heap

    public void heapifyTopToBottom(int index, String heapType) {  //Time complexity O(LogN)

        int left = index * 2;
        int right = index * 2 + 1;

        int swapChild = 0;

        if (sizeOfTree < left) {            // if it has no child.
            return;
        }
        // write Conditions for the maximmum binary Heap and Condition for the minimum Heap

        if (heapType == "Max") {

            // 2 conditions ->one child -> 2 children

            if (sizeOfTree == left) {

                if (array[index] < array[left]) {   //root index < child swap

                    int temp = array[index];             //swap operation
                    array[index] = array[left];
                    array[left] = temp;

                }
                return;
            } else {  // for the maximum heap(wit) we are going to take the greater.

                if (array[left] > array[right]) {

                    swapChild = left;
                } else {
                    swapChild = right;
                }

                if (array[index] < array[swapChild]) {

                    int temp = array[index];             //swap operation
                    array[index] = array[swapChild];
                    array[swapChild] = temp;

                }


            }

        } else if (heapType == "Min") {

            // 2 conditions ->one child -> 2 children

            if (sizeOfTree == left) {

                if (array[index] > array[left]) {   //root index < child swap

                    int temp = array[index];             //swap operation
                    array[index] = array[left];
                    array[left] = temp;

                }
                return;
            } else {  // for the maximum heap(wit) we are going to take the greater.

                if (array[left] < array[right]) {

                    swapChild = left;
                } else {
                    swapChild = right;
                }

                if (array[index] > array[swapChild]) {

                    int temp = array[index];             //swap operation
                    array[index] = array[swapChild];
                    array[swapChild] = temp;

                }


            }


            heapifyTopToBottom(swapChild, heapType);   //run recursively   all Takes(O(n))

        }


    }

    // the real extraction if a node from Binary Heap
    public int extractHeapofBinaryHeap(String heapType) {

        if (isEmpty()) {
            return -1;
        } else {
            int extractValue = array[1];    // Root Value
            array[1] = array[sizeOfTree];    // set the last element of tree as root value
            sizeOfTree--;

            heapifyTopToBottom(1, heapType);   //O(LogN) both time and space
            levelOrderinBHP();
            return extractValue;
        }

    }


    //delete Binary Heap
    public void deleteBinaryHeap() {  //O(1)
        array = null;
    }


    public static void main(String[] args) {

        BinaryHeap newBp = new BinaryHeap(5);         //Time complextity = O(1)
        newBp.peek();                                            // Space Complexity = O(n)
        newBp.levelOrderinBHP();                              //time complexity O(n) space complexity O(1)
    }


}
