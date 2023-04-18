package Sorting;

import java.util.Arrays;

public class StringSort {

    // Problem statement
    // Sort a String using their last number
    // Though this is not the original problem.....
    // the orignal problem => has Convert a String i.e break a String into a List of Strings

    String[] pokus = {"USA10", "CESKO2", "KANADA32", "SLOVENSKO11",
            "SPANELSKO22", "NIZOZEMI3", "NEMECKO31"};

    public void sm() {

        Arrays.sort(pokus, (a, b) -> Integer.compare(
                Integer.parseInt(b.replaceAll("\\D+", "")),
                Integer.parseInt(a.replaceAll("\\D+", ""))
        ));
        System.out.println(Arrays.toString(pokus));

    }



}
