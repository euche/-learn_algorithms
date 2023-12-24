package String;

import java.util.*;


public class ImplementStrStr {
    public static void main(String[] args) throws Exception {

    }

    // Implement strStr(). Returns a pointer to the first occurrence of needle in haystack, or
    //null if needle is not part of haystack.

    // Steps/thoughts
    // First, need to understand the problem correctly, the pointer simply means a sub string.
    //Second, make sure the loop does not exceed the boundaries of two strings.

    public static String strStr(String haystack, String needle) {
        int nl = needle.length();
        int hl = haystack.length();
        if (nl == hl && nl == 0)
            return "";
        if (nl == 0)
            return haystack;
        for (int i = 0; i < hl; i++) {
// make sure in boundary of needle
            if (hl - i + 1 < nl)
                return null;


            int k = i;
            int j = 0;

            while (j < nl && k < hl & needle.charAt(j) == haystack.charAt(k)) {
                j++;
                k++;
                if (j == nl)
                    return haystack.substring(i);
            }
        }

        return null;

    }


}
