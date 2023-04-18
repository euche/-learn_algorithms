package String;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstring {

// Problem Statement: Given a string s, find the length of the longest substring without repeating characters.
// First testcase
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    public int lengthOfLongestSubstring(String s) { // My own solution using Hashset
// My Solution using Hashset didnt pass th last testcase
        HashSet<Character> sa = new HashSet<>();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            if (!sa.contains(s.charAt(i))) {
                sa.add(s.charAt(i));
                if (sa.size() > maxLength) {
                    maxLength = sa.size();
                }

            } else {
//                while(sa.remove(s.charAt(0)) != s.charAt(i)){}
                sa.add(s.charAt(i));
            }
        }

        return maxLength;
    }


    //Solution that passed all test cases
    public int lengthOfLongestSsubstring(String s) {

        Queue<Character> q = new LinkedList<>();
        int maxl = 0;

        for (int i = 0; i < s.length(); i++) {

            if (!q.contains(s.charAt(i))) {
                q.add(s.charAt(i));
                if (q.size() > maxl) {
                    maxl = q.size();
                }
            } else {
                while (q.poll() != s.charAt(i)) {
                }    // i see..Queue's poll() method removes the head in the queue
                q.add(s.charAt(i));
            }

        }
        return maxl;


    }


}
