/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KMP;

/**
 *
 * @author Dell
 */
public class KMPexample {
    
//    A linear time (!) algorithm that solves the string matching
//problem by preprocessing P in ?(m) time
//– Main idea is to skip some comparisons by using the previous
//comparison result
//? Uses an auxiliary array ? that is defined as the following:
//– ?[i] is the largest integer smaller than i such that P1 . . . P?[i]
//is
//a suffix of P1 . . . Pi
//? ... It’s better to see an example than the definition
    
    
    public static void KmpPatternSearch(String txt, String pattern){
    
         int M = pattern.length();
        int N = txt.length();
        
        
        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int lps[] = new int[M];
        int j = 0; // index for pattern[]
        int i = 0; // index for txt[]
    
        computeLPSArray(pattern, M, lps);
    
        while (i < N) {
            if (pattern.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern "
                                   + "at index " + (i - j));
                j = lps[j - 1];
            }
            // mismatch after j matches
            else if (i < N && pattern.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        
        
        
    
    }
    
    
    public static void computeLPSArray(String pattern,int M,int lps[]){
    
    // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0
  
     while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else // (pat[i] != pat[len])
            {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (len != 0) {
                    len = lps[len - 1];
  
                    // Also, note that we do not increment
                    // i here
                }
                else // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    
    }
    
    
    public static void main(String args[])
    {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
       
        KmpPatternSearch(pat, txt);
    }
    
    
}
