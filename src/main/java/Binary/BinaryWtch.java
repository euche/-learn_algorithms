package Binary;

import java.util.ArrayList;
import java.util.List;

public class BinaryWtch {
    //Leetcode question

    //Binary watch

    //A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6 LEDs on the bottom to represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.
    //
    //For example, the below binary watch reads "4:51".

    //Given an integer turnedOn which represents the number of LEDs that are currently on (ignoring the PM), return all possible times the watch could represent. You may return the answer in any order.
    //
    //The hour must not contain a leading zero.
    //
    //For example, "01:00" is not valid. It should be "1:00".
    //The minute must be consisted of two digits and may contain a leading zero.
    //
    //For example, "10:2" is not valid. It should be "10:02".

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();


        // Hours iterate from 0-11 and
        // Minutes iterate from 0-59.

        // See for which values, number of 1's match
        // with the value <num> provided.

        for(int h=0; h<12; h++) {

            for(int m=0; m<60; m++) {

                // Number of set bits in hour portion and in minute
                // part has to be equal to num.
                if(Integer.bitCount(h)
                        + Integer.bitCount(m) == turnedOn) {
                    ans.add(String.format("%d:%02d",h,m));
                }

            }

        }

        return ans;
    }
}
