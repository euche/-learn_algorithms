/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numberarray;

import java.util.*;

/**
 * @author Dell
 */
public class containsdup {

    public static boolean containsDuplicate(int[] nums) {

        boolean valid = false;

        Arrays.sort(nums);

        if (nums.length <= 1) {
            return valid;
        }

        for (int i = 0; i < nums.length; i++) {

            while (i < nums.length - 1) {
                if (nums[i] == nums[i + 1]) {
                    valid = true;
                    return valid;
                } else {
                    return valid;
                }

            }


        }
        return valid;
    }    // does not pass all the Usecases


    public static boolean containsDuplicate(int[] nums, int a) {

        boolean valid = false;

        if (nums.length <= 1) {
            return valid;
        }

        HashSet<Integer> s = new HashSet<>();
        for (int i : nums) {

            if (!s.add(i)) {           // returns true (add(0 method) if the set did not contain the specified element, if it is opposite(!add()) it returns false
                //i.e adds a specific element if it is not present in the set
                valid = true;
                return valid;
            }

        }

        return valid;
    }


    public static void main(String[] args) {
        int[] nums = {3, 3, 2, 4, 12, 3, 3};
        int[] numssec = {3, 2, 4, 1};

        System.out.println(containsDuplicate(numssec, 0));
        System.out.println(containsDuplicate(nums));


    }


}
