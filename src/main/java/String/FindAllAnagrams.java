package String;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

//    Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
//
//    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//    Input: s = "cbaebabacd", p = "abc"
//    Output: [0,6]
//    Explanation:
//    The substring with start index = 0 is "cba", which is an anagram of "abc".
//    The substring with start index = 6 is "bac", which is an anagram of "abc".

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
        int[] hash = new int[256]; //character hash; -> creates an array of 256 integers
        //record each character in p to hash
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        //two points, initialize count to p's length
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            //move right everytime, if the character exists in p's hash, decrease the count
            //current hash value >= 1 means the character is existing in p
            if (hash[s.charAt(right++)]-- >= 1) count--;

            //when the count is down to 0, means we found the right anagram
            //then add window's left to result list
            if (count == 0) list.add(left);

            //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
            //++ to reset the hash because we kicked out the left
            //only increase the count if the character is in p
            //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;


    }


}
