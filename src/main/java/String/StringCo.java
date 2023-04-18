package String;

public class StringCo {
    //Strings Construction

    // Given two Strings a and b both consisting only of lowercase English letters, your task is to calculate how many strings equal to a can be constructed
    //using only letters from the string b? Each letter can be used only once and in one string only

    // Example
    // for a = "abc"  and b = "abccba", the output should be solution(a,b) = 2
    // we can construct 2 strings a = "abc" using only letters from the string b


    int solution(String a, String b) {

        int b1 = b.length();
        int b2 = a.length();


        int lf[] = new int[26];
        int lf2[] = new int[26];

        for (int i = 0; i < b1; i++) {
            lf[b.charAt(i) - 'a'] += 1;

        }

        for (int i = 0; i < b2; i++) {
            lf2[a.charAt(i) - 'a'] += 1;

        }

        int count = Integer.MAX_VALUE;

        for (int i = 0; i < b2; i++) {

            count = Math.min(count, lf[a.charAt(i) - 'a'] / lf2[a.charAt(i) - 'a']);
        }

        return count;
    }
}