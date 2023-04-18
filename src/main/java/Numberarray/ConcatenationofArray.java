package Numberarray;

import java.util.Arrays;

public class ConcatenationofArray {

    //Problem Statement
    //Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    //
    //Specifically, ans is the concatenation of two nums arrays.
    //
    //Return the array ans.




    public int[] getConcatenation(int[] nums) {   //DIDNT COMPLETE MY ANSWER
        int [] a;
        int [] b;
        int[] ans;

        a = Arrays.copyOf(nums,nums.length);
        b = Arrays.copyOf(nums,nums.length);

        // i am stuck
        return nums;
    }

    public int[] ggetConcatenation(int[] nums){

        //create an Array of 2*Length
        //use i%n index for setting values
        //i.e if value goes over N, it would start again


       int n = nums.length;
       int[] result = new int[2*n];
       for (int i = 0; i < result.length; i++){
           result[i] = nums[i%n];
       }
      return result;

    }



}
