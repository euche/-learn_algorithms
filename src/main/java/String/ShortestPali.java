package String;

public class ShortestPali {

    //Leetcode Question Hard

   // You are given a string s. You can convert s to a palindrome by adding characters in front of it.
//
//    Return the shortest palindrome you can find by performing this transformation

    //Example 1:
    //
    //Input: s = "aacecaaa"
    //Output: "aaacecaaa"
    //Example 2:
    //
    //Input: s = "abcd"
    //Output: "dcbabcd"


    //Answer solved by ChatGPT....Verified answer

    // Step by step explanation of solution
    // The solution above uses the KMP (Knuth-Morris-Pratt) algorithm to find the shortest palindrome. Here's how it works:
    //
    //1 => Create a new string l by concatenating the original string s and its reverse rev_s with a separator #. The separator is used to prevent overlapping between the two strings.
    //
    //2 => Create an integer array f to store the length of the longest palindromic prefix and suffix in l.
    //
    //3 => Use a loop to calculate the values in f using the KMP algorithm. The calculation is based on the previously calculated values in f and the current character in l.
    //
    //4 => The length of the shortest palindrome is equal to the length of s minus the last value in f. The remaining part of rev_s is appended to s to form the final result.
    //
    //5 => The KMP algorithm is efficient in finding the length of the longest palindromic prefix and suffix in a string, which makes it a good fit for solving the shortest palindrome problem.

    public String shortestPalindrome(String s) {
        String rev_s = new StringBuilder(s).reverse().toString();
        String l = s + "#" + rev_s;
        int n = l.length();
        int[] f = new int[n];
        for (int i = 1; i < n; i++) {
            int j = f[i - 1];
            while (j > 0 && l.charAt(i) != l.charAt(j)) {
                j = f[j - 1];
            }
            if (l.charAt(i) == l.charAt(j)) {
                j++;
            }
            f[i] = j;
        }
        return rev_s.substring(0, s.length() - f[n - 1]) + s;
    }

}
