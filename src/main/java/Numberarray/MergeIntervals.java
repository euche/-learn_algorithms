package Numberarray;

import java.util.ArrayList;
import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) throws Exception {

    }


    //Problem
    // Given a collection of intervals, merge all overlapping intervals
    //
    //For example,
    //Given [1,3],[2,6],[8,10],[15,18],
    //return [1,6],[8,10],[15,18].

    //Steps to solve this problem
    // 1) Define a Comparator first to sort the arraylist of Intervals.
    // 2) Merge some intervals
    // Basically utilizing the advantage of sorted list/ array.


    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        // sort intervals by using Comparator
        Collections.sort(intervals, new IntervalComparator());
        ArrayList<Interval> result = new ArrayList<Interval>();
        Interval prev = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);  //get second value from intervals arraylist
            if (prev.end >= curr.start) {
                //merged case
                prev = new Interval(prev.start, Math.max(prev.end, curr.end));
            } else {
                result.add(prev);
                prev = curr;
            }
        }
        result.add(prev);
        return result;

    }


}

class IntervalComparator implements Comparator<Interval> {

    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.start - o2.start;
    }
}


class Interval {
    int start, end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

}
