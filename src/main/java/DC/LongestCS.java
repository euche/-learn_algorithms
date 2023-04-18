package DC;

public class LongestCS {

    // Longest Common Subsequence Problem.
    //Problem statement:
    // S1 and S2 are given Strings
    // Find the length of the Longest Subsequence which is common to both Strings.

    // Example
    //S1 = "elephant"      aaad,aab, ->aa
    //S2 = "erepat"
    // Output = 5
    // Longest String: "eepat"

  // Check out the Pseudcode

    private int findCSLlength(String s1, String s2,int index1,int index2){

        // Writing Base Conditions... to cut off Recursive loop.
        if(index1 == s1.length()||index2 == s2.length()){
            return 0;
        }
        int c1 = 0;
        if(s1.charAt(index1) == s2.charAt(index2)){
            c1 = 1 + findCSLlength(s1,s2,index1+1,index2+1);
        }
        int c2 = findCSLlength(s1,s2,index1,index2+1);
        int c3 = findCSLlength(s1,s2,index1+1,index2);

        return Math.max(c1,Math.max(c2,c3));

    }

    public int findCSLlength(String s1, String s2){
        return findCSLlength(s1,s2,0,0);
    }


}
