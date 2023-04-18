/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;
import java.util.*;

/**
 *
 * @author Dell
 */

// Question
//Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates)
//is included in the window. If there is no such substring, return the empty string "".
//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"
//Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.


public class Minimuwindowsubstring {
    
     public String minWindow(String s, String t) {
     
        if(s.equalsIgnoreCase(t)){              // Test case 2
        
        return s;
        }else if(s.length()<t.length()){    //Test case 3
        
           return "";   //return emptyString
        
        }
        
        int [] map = new int[128];
    for (char c : t.toCharArray()) {
      map[c]++;
    }
    int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
    while (end < s.length()) {
      final char c1 = s.charAt(end);
      if (map[c1] > 0) counter--;
      map[c1]--;
      end++;
      while (counter == 0) {
        if (minLen > end - start) {
          minLen = end - start;
          minStart = start;
        }
        final char c2 = s.charAt(start);
        map[c2]++;
        if (map[c2] > 0) counter++;
        start++;
      }
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
            
            
     }
    
     
     //NOTE: FOR MOST SUBSTRING PROBLEMS
     
//     Here comes the template.
//
//For most substring problem, we are given a string and need to find a substring of it which satisfy some restrictions. A general way is to use a hashmap assisted with two pointers. The template is given below.
//
//int findSubstring(string s){
//        vector<int> map(128,0);
//        int counter; // check whether the substring is valid
//        int begin=0, end=0; //two pointers, one point to tail and one  head
//        int d; //the length of substring
//
//        for() { /* initialize the hash map here */ }
//
//        while(end<s.size()){
//
//            if(map[s[end++]]-- ?){  /* modify counter here */ }
//
//            while(/* counter condition */){ 
//                 
//                 /* update d here if finding minimum*/
//
//                //increase begin to make it invalid/valid again
//                
//                if(map[s[begin++]]++ ?){ /*modify counter here*/ }
//            }  
//
//            /* update d here if finding maximum*/
//        }
//        return d;
//  }
     
     
     
     
     
    // One thing needs to be mentioned is that when asked to find maximum substring, 
    //we should update maximum after the inner while loop to guarantee that the substring is valid. On the other hand, 
    //when asked to find minimum substring, we should update minimum inside the inner while loop.
     
     
     
     
     
     public static void main(String[] args){
     
     
     
     
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    
}
