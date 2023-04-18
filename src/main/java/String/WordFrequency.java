package String;

import java.util.Map;
import java.util.TreeMap;

public class WordFrequency {

    //Calculate the frequency of each word in the given string
    //Difficulty Level : Medium

//
//    Output: GeeksforGeeks
//    For 1
//    Geeks 2
//    Explanation:
//    For occurs 1 time and Geeks occurs 2 times in the given string str.

    public static void count_freq(String str) {

        Map<String, Integer> count_map = new TreeMap<>();
        // split into String array,,,

        String[] arr = str.split(" ");

        //loop to iterate over the words
        for (int i = 0; i < arr.length; i++) {

            // check if array element is present in the TreeMap..
            if (count_map.containsKey(arr[i])) {
                count_map.put(arr[i], count_map.get(arr[i]) + 1);  // Map.get(Object Key) gets the value attached to that key....
            } else {
                count_map.put(arr[i], 1);
            }
        }

        //loop to iterate over the elements of the map
        for(Map.Entry<String, Integer> e: count_map.entrySet()){
            System.out.println(e.getKey()+
                    " - "+e.getValue());
        }

    }

    //SMALL NOTE ON TREE MAP

   // Java TreeMap class is a red-black tree based implementation
    // stores key-value pairs in sorted order
    // Member of Java collections.
    // does not allow null keys...NullPointerException is thrown
    //multiple null values can be associated with different keys..
    // TreeMap is not synchronised. i.e multiple threads access a tree set concurrently, at least one of the threads modifies the set.
    // must be synchronised externally using  Collections.synchronizedSortedMap. Best done at creation time, to prevent accidental unsynchronised access to the set.

    //e.g
     //SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));




}
