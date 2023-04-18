package String;

public class JewelsandStones {

    // Leetcode question

    //You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
    //
    //Letters are case-sensitive, so "a" is considered a different type of stone from "A".
    //
    //
    //
    //Example 1:
    //
    //Input: jewels = "aA", stones = "aAAbbbb"
    //Output: 3
    //Example 2:
    //
    //Input: jewels = "z", stones = "ZZ"
    //Output: 0


    public int numJewelsInStones(String jewels, String stones) {   //solution worked well on first try

        int count = 0;
        char[] jewelsArray = jewels.toCharArray();

        char[] stonesArray = stones.toCharArray();

        for (int i = 0; i < stonesArray.length; i++) {

            for (char c : jewelsArray) {

                if (c == stonesArray[i]) {
                    count++;
                }
            }

        }

        return count;


    }


}
