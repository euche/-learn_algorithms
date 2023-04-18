package Sorting;

public class SortMain {

    public static void main(String[] args){
        int[] arr = {1,2,3,7,8,9,4,6,5};
        StringSort a = new StringSort();
        a.sm();

        // test mergeSort
        MergeSort.mergeSort(arr,0,arr.length-1);
        MergeSort.printArray(arr);

        Bucketsort sd = new Bucketsort(arr);
        sd.printArray();
        sd.bucketSort();
        sd.printArray();

        HeapSort ac = new HeapSort(arr);
        ac.sortMethod();
        ac.printArray(arr);



    }

}
