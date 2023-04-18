package Numberarray;

import java.util.HashMap;

public class NumberOfPairsInterchangeableRectangles {

    //Leetcode question

    //You are given n rectangles represented by a 0-indexed 2D integer array rectangles, where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.
    //
    //Two rectangles i and j (i < j) are considered interchangeable if they have the same width-to-height ratio. More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).
    //
    //Return the number of pairs of interchangeable rectangles in rectangles.

    //Example 1:
    //
    //Input: rectangles = [[4,8],[3,6],[10,20],[15,30]]
    //Output: 6
    //Explanation: The following are the interchangeable pairs of rectangles by index (0-indexed):
    //- Rectangle 0 with rectangle 1: 4/8 == 3/6.
    //- Rectangle 0 with rectangle 2: 4/8 == 10/20.
    //- Rectangle 0 with rectangle 3: 4/8 == 15/30.
    //- Rectangle 1 with rectangle 2: 3/6 == 10/20.
    //- Rectangle 1 with rectangle 3: 3/6 == 15/30.
    //- Rectangle 2 with rectangle 3: 10/20 == 15/30.

    //Solved using chatGPT.

    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> ratioCounts = new HashMap<>();

        for(int[] rect: rectangles){
            double ratio =(double) rect[0]/rect[1] ;

            ratioCounts.put(ratio, ratioCounts.getOrDefault(ratio,0)+1);

        }

        Long pairs = 0L;

        for(int count: ratioCounts.values()) {
            pairs = pairs + (long) count*(count-1)/2;

        }
        return pairs;

    }



}
