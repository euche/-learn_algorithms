package DC;

public class LongestPalindromS {
    //Problem  Statement
    //- S is a given String
    //- Find the longest palindrome subsequence (LPS)
    //Subsequence: it can be driven from another sequence by deleting some elements without changing the order of them.
    //- Palindrome is a String that reads the same backward as well as forward


    private int findLPSLength(String s, int startIndex, int endIndex) {
        // Define Base Conditions
        if (startIndex > endIndex) {
            return 0;
        }

        if (startIndex == endIndex) {
            return 1;
        }
        int count1 = 0;
        if(s.charAt(startIndex) == s.charAt(endIndex)){
            count1 = 2 + findLPSLength(s,startIndex+1,endIndex-1);
        }
            int count2 = findLPSLength(s,startIndex,endIndex-1);
            int count3 = findLPSLength(s,startIndex+1,endIndex);

        return Math.max(count1,Math.max(count2,count3));
    }

    public int findLPSLength(String s){
        return findLPSLength(s,0,s.length()-1);
    }


}
