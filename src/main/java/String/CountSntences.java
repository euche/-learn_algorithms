package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountSntences {

    //Algorithm Question
    // Given a set of words and a set of sentences (compared of those words), determine how many sentences can be created by
    // rearranging the letters of each word in each input sentence, where rearranging words is only possible if the resulting word is
    // also present in the input set of words.

    // CHATGPT Suggested steps
    //Create a hash table to store the words in the input set of words, where the key is the sorted word, and the value is a list of words that can be formed from the same letters. For example, for the word "eat", the key would be "aet" and the value would be a list containing "eat".
    //
    //For each sentence in the input set of sentences, split the sentence into words and sort each word. Then, check if the sorted word is present in the hash table. If it is, add the original word to a list. If all the words in the sentence are present in the hash table, add the sentence to a counter.
    //
    //Repeat step 2 for all sentences and return the counter as the result.




    //Example
    // wordSet = ['listen','silent','it','is']
    // sentence = 'listen it is silent'

    // The answer here is unverified.
    // Based on ChatGPT Answer translated from python to java.

    public static List<Long> countRearrangeableSentences(String[] words, String[] sentences) {
        HashMap<String, List<String>> wordMap = new HashMap<>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            java.util.Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (!wordMap.containsKey(sortedWord)) {
                wordMap.put(sortedWord, new ArrayList<String>());
            }
            wordMap.get(sortedWord).add(word);
        }

        List<Long> counts = new ArrayList<>();
        for (String sentence : sentences) {
            String[] sentenceWords = sentence.split(" ");
            boolean isSentenceRearrangeable = true;

            for (String sentenceWord : sentenceWords) {
                char[] charArray = sentenceWord.toCharArray();
                java.util.Arrays.sort(charArray);
                String sortedWord = new String(charArray);

                if (!wordMap.containsKey(sortedWord) ||
                        !wordMap.get(sortedWord).contains(sentenceWord)) {
                    isSentenceRearrangeable = false;
                    break;
                }
            }

            if (isSentenceRearrangeable) {
                counts.add(1L);
            } else {
                counts.add(0L);
            }
        }

        return counts;
    }

}
