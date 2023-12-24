package String;

import java.util.*;

public class RegulrarExpMatch {

    // Implement regular expression matching with support for ’.’ and ’*’
    //’.’ Matches any single character.
    //’*’ Matches zero or more of the preceding element.

    //E.g
    //Some examples:
    //isMatch("aa","a") return false
    //isMatch("aa","aa") return true
    //isMatch("aaa","aa") return false

    //Analysis

//    The problem should be simplified to handle 2 basic cases:
//            • the second char of pattern is "*"
//            • the second char of pattern is not "*
//

    public static void main(String[] args) throws Exception {

        String h = "aa";
        String j = "aa";

        System.out.println(isMatch(h, j));
    }

    public static boolean isMatch(String s, String p) {

        //base conditions
        if (p.length() == 0)
            return s.length() == 0;

        if (p.length() == 1 || p.charAt(1) != '*') {
            if (s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)))
                return false;
            return isMatch(s.substring(1), p.substring(1));
        } else {
            int len = s.length();
            int i = -1;
            while (true) {  // while(i < len && (i < 0||p.charAt(0) == '.'||p.charAt(0) == s.charAt(i)))
                if (isMatch(s.substring(i + 1), p.substring(2))) {
                    return true;
                }
                i++;
            }
        }
    }


}
