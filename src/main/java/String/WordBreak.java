package String;

import java.util.*;

public class WordBreak {

    //Leetcode
    
    // Given a string s and a dictionary of words dict, determine if s can be segmented into
    //a space-separated sequence of one or more dictionary words. For example, given s =
    //"leetcode", dict = ["leet", "code"]. Return true because "leetcode" can be segmented as
    //"leet code".

// For the Solution: We are going with DYNAMIC PROGRAMMING Approach Solution
// • Define an array t[] such that t[i]==true =>0-(i-1) can be segmented using dictionary
// • Initial state t[0] == true
// THOUGH, it doesn't work for this Scenario;
// "programcreek", ["programcree","program","creek"].
    // We should get all possible matches, not stop at "programcree".

    public boolean wordBreak(String s, Set<String> dictionary){
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why? to Define Initial state
        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i])
                continue;
            for(String a: dictionary){ //neccessary for comparing strings in the dictionary
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
                if(t[end])
                    continue;
                if(s.substring(i,end).equals(a)){
                    t[end] = true;
                }
            }
        }


        return t[s.length()];
    }





}
