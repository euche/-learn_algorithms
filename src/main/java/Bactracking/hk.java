package Bactracking;

import java.util.ArrayList;
import java.util.*;

public class hk {

//    public static List<Integer> oddNumbers(int l, int r) {
//
//        int size = (r - 1) / 2 + 1;
//
//        List<Integer> on = new ArrayList<Integer>();
//        int index = 0;
//
//        for (int i = 1; i <= r; i++) {
//            if (i % 2 != 0) {
//                on.add(i);
//            }
//        }
//        return on;
//    }

//    Given a set of words and a set of sentences (composed of those words), determine how many sentences can be created by rearranging the letters of each word in each input sentence, where rearranging words is only possible if the resulting word is also present in the input set of words.
//
//    Example
//
//    wordSet['listen', 'silent', 'it', 'is']
//
//    sentence 'listen it is silent
//
//    Note: The words in the set are unique, sentences are composed only of words from the word set and a sentence is composed of words separated by a single".
//
//            30
//
//            > p
//
//    Determine that the letters of listen can be rearranged into silent (i.e. these words are anagrams). Those two words can be replaced with each other. The four sentences that can be created are:
//
//            ⚫ listen it is silent
//
//• listen it is listen
//
//• silent it is silent
//
//    silent it is listen



    public static List<Long> countSentences(List<String> wordset,List<String> sentences){
        long[] result = new long[sentences.size()];

        Set<String> wordSetSet = new HashSet<>(wordset);

        for (int i = 0; i < sentences.size(); i++) {
            String sentence = sentences.get(i);
            String[] words = sentence.split(" ");
            countRearrangementsHelper(words, 0, wordSetSet, result, i);
        }
       // List<Long > ans = new ArrayList<>(Arrays.asList(result));
        Long[] resultArray = Arrays.stream(result).boxed().toArray(Long[]::new);
        // Arrays.asList(resultArray);
        //return Arrays.asList(result);
        return Arrays.asList(resultArray);
    }

    private static void countRearrangementsHelper(String[] words, int index, Set<String> wordSetSet, long[] result, int sentenceIndex) {
        if (index == words.length) {
            result[sentenceIndex]++;
            return;
        }

        for (int i = index; i < words.length; i++) {
            if (wordSetSet.contains(words[i])) {
                // Swap the words to consider all possible rearrangements
                swap(words, index, i);

                countRearrangementsHelper(words, index + 1, wordSetSet, result, sentenceIndex);

                // Backtrack by swapping back
                swap(words, index, i);
            }
        }
    }

    private static void swap(String[] words, int i, int j) {
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
    }


    public static int countSubstrings(String binaryString) {
        int count = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            for (int j = i + 1; j <= binaryString.length(); j++) {
                String substring = binaryString.substring(i, j);

                if (isValidSubstring(substring)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isValidSubstring(String substring) {
        int countZeros = 0;
        int countOnes = 0;

        for (char ch : substring.toCharArray()) {
            if (ch == '0') {
                countZeros++;
            } else if (ch == '1') {
                countOnes++;
            }
        }

        return countZeros == countOnes;
    }



}
