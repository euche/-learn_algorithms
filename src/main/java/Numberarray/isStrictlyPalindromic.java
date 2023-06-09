package Numberarray;

import java.util.ArrayList;
import java.util.List;

public class isStrictlyPalindromic {

    // Leetcode Question MEDIUM
    //
    //An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.
    //
    //Given an integer n, return true if n is strictly palindromic and false otherwise.
    //
    //A string is palindromic if it reads the same forward and backward.
    //
    //
    //
    //Example 1:
    //
    //Input: n = 9
    //Output: false
    //Explanation: In base 2: 9 = 1001 (base 2), which is palindromic.
    //In base 3: 9 = 100 (base 3), which is not palindromic.
    //Therefore, 9 is not strictly palindromic so we return false.
    //Note that in bases 4, 5, 6, and 7, n = 9 is also not palindromic.
    //Example 2:
    //
    //Input: n = 4
    //Output: false
    //Explanation: We only consider base 2: 4 = 100 (base 2), which is not palindromic.
    //Therefore, we return false.

    // WHAT WAS USED IS BINARY AND TWO POINTER TECHNIQUE

    public static boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            List<Integer> digits = new ArrayList<Integer>();
            int x = n;
            while (x > 0) {
                digits.add(x % base);
                x /= base;
            }
            if (isPalindrome(digits)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(List<Integer> digits) {
        int n = digits.size();
        for (int i = 0; i < n / 2; i++) {
            if (!digits.get(i).equals(digits.get(n - 1 - i))) { //TWO POINTER TECHNIQUE
                return false;
            }
        }
        return true;
    }


}
