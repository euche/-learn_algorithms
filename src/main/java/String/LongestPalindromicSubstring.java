package String;

public class LongestPalindromicSubstring {

    // Question 3
    // Finding the longest palindromic substring is a Classic problem of coding interview
    // For this Solution, We are using Dynamic Programming.
    //
    //==> What to do,
//    Define a 2-dimension array "table" and let table[i][j] denote whether substring from  i to j is palindrome.

//    Start condition:
//    table[i][i] == 1;
//    table[i][i+1] == 1 => s.charAt(i) == s.charAt(i+1)
//  Changing condition:
//  table[i+1][j-1] == 1 && s.charAt(i) == s.charAt(j)
//=>
//   table[i][j] == 1


    public static String longestPalindrome2(String s) {

        if (s == null) {
            return null;
        }
        if (s.length() <= 1) {
            return s;
        }
        int maxLen = 0;
        String longestStr = null;
        int length = s.length();
        int[][] table = new int[length][length]; //2 Dimension array table.

        //Scenario where every Single letter is palindrome
        for (int i = 0; i < length; i++) {
            table[i][i] = 1;
        }
        printTable(table);
        //e.g. bcba
//        two consecutive same letters are palindrome
        for (int i = 0; i <= length - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = 1;
                longestStr = s.substring(i, i + 2);
            }
        }
        printTable(table);

        //condition for calculating the whole table
        for (int l = 3; l <= length; l++) {
            for (int i = 0; i <= length - l; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    table[i][j] = table[i + 1][j - 1];
                    if (table[i][j] == 1 && l > maxLen)
                        longestStr = s.substring(i, j + 1);
                } else {
                    table[i][j] = 0;
                }
                printTable(table);
            }
        }
        return longestStr;
    }

    public static void printTable(int[][] x) {
        for (int[] y : x) {
            for (int z : y) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
        System.out.println("------");
    }


    public static void main(String[] args) {
        String f = "dhdhhdyyryr";
        System.out.println(longestPalindrome2(f));
    }


}
