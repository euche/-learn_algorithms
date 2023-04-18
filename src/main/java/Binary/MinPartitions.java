package Binary;

public class MinPartitions {

    // Leetcode Medium
//    A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
//
//    Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.
//   Example 1
//  Input: n = "32"
//  Output: 3
//  Explanation: 10 + 11 + 11 = 32
//
//


  public int minPartitions(String n){

       int res = 0;
       for(int i =0; i < n.length(); ++i){
         // res = Math.max(res,Integer.parseInt(Character.toString(n.charAt())))
         res = Math.max(res,Integer.parseInt(Character.toString(n.charAt(i))));

       }

        return res;

    }





}